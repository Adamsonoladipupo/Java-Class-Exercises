package utils;

import data.models.Book;
import dtos.requests.AddBookRequest;
import dtos.requests.AddUserRequest;
import dtos.responses.AddBookResponse;
import dtos.responses.AddUserResponse;

public class AddBookMapper {
    public AddBookRequest addBookRequest(Book book){
        AddBookRequest addBookRequest = new AddBookRequest();
        addBookRequest.setName(book.getName());
        addBookRequest.setAuthor(book.getAuthor());
        addBookRequest.setIsbn(book.getIsbn());
        addBookRequest.setEdition(book.getEdition());
        addBookRequest.setPages(book.getPages());
        addBookRequest.setQuantity(book.getQuantity());
        addBookRequest.setDescription(book.getDescription());
        addBookRequest.setGenre(book.getGenre());
        addBookRequest.setID(book.getID());

        return addBookRequest;
    }

    public AddBookResponse addBookResponse(AddBookRequest addBookRequest){
        AddBookResponse addBookResponse = new AddBookResponse();
        addBookResponse.setID(addBookRequest.getID());
        addBookResponse.setAuthor(addBookRequest.getAuthor());
        addBookResponse.setName(addBookRequest.getName());

        return addBookResponse;
    }

}
