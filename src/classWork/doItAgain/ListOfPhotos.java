package classWork.doItAgain;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class ListOfPhotos {
    public static void main(String[] args) {
        photosLoading();
    }
    public static void photosLoading(){
        String photosLocation = "C:\\Users\\DELL\\Documents\\MyProject\\Project\\FilesPractice\\src\\classWork\\doItAgain\\photos.json";
        ObjectMapper objectMapper = new ObjectMapper();
        try(FileInputStream fileInputStream = new FileInputStream(photosLocation)){
            List<Photos> listOfPhotosObject = objectMapper.readValue(fileInputStream, new TypeReference<List<Photos>>() {});
            for(Photos photo : listOfPhotosObject){
                if(photo.getId() % 2 == 0){
                System.out.println("Id: " + photo.getId() + ", Title: " + photo.getTitle());
                }
            }

        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }

    }
}
