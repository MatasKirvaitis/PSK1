package lt.vu.rest;

import lombok.Getter;
import lombok.Setter;
import lt.vu.entities.Author;
import lt.vu.persistence.AuthorsDAO;
import lt.vu.rest.contracts.AuthorDto;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.OptimisticLockException;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@ApplicationScoped
@Path("/author")
public class AuthorController {
    @Inject
    @Setter @Getter
    private AuthorsDAO authorsDAO;

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getById(@PathParam("id") final Integer id){
        Author author = authorsDAO.findOne(id);
        if(author == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        AuthorDto authorDto = new AuthorDto();
        authorDto.setFirstName(author.getFirstName());
        authorDto.setLastName(author.getLastName());
        authorDto.setPersonalCode(author.getPersonalCode());

        return Response.ok(authorDto).build();
    }

    @Path("/{id}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response update(@PathParam("id") final Integer authorId, AuthorDto authorDto){
        try{
            Author existingAuthor = authorsDAO.findOne(authorId);
            if(existingAuthor == null){
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            existingAuthor.setFirstName(authorDto.getFirstName());
            existingAuthor.setLastName(authorDto.getLastName());
            existingAuthor.setPersonalCode(authorDto.getPersonalCode());

            authorsDAO.update(existingAuthor);
            return Response.ok().build();
        } catch (OptimisticLockException e){
            return Response.status(Response.Status.CONFLICT).build();
        }
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response create(AuthorDto authorDto){
        try{
            Author newAuthor = new Author();
            newAuthor.setFirstName(authorDto.getFirstName());
            newAuthor.setLastName(authorDto.getLastName());
            newAuthor.setPersonalCode(authorDto.getPersonalCode());

            authorsDAO.persist(newAuthor);
            return Response.ok().build();
        } catch (OptimisticLockException e){
            return Response.status(Response.Status.CONFLICT).build();
        }
    }
}
