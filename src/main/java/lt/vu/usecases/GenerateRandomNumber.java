package lt.vu.usecases;

import lt.vu.interceptors.LoggedInvocation;
import lt.vu.services.Generator;
import org.omnifaces.util.Faces;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@SessionScoped
@Named
public class GenerateRandomNumber implements Serializable {
    @Inject
    Generator generator;

    private CompletableFuture<Integer> numberGenerationTask = null;

    @LoggedInvocation
    public String generateNumber(){
        Map<String, String> requestParameters =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        numberGenerationTask = CompletableFuture.supplyAsync(() -> generator.generateNumber());
        return "/authorsBooks.xhtml?faces-redirect=true&authorId=" + requestParameters.get("authorId");
    }

    public boolean isGenerationRunning(){
        return numberGenerationTask != null && !numberGenerationTask.isDone();
    }

    public String getGenerationStatus() throws ExecutionException, InterruptedException{
        if(numberGenerationTask == null){
            return null;
        } else if (isGenerationRunning()){
            return "Generating amount of pages you should read today...";
        }
        return "Read this many pages today: " + numberGenerationTask.get();
    }
}
