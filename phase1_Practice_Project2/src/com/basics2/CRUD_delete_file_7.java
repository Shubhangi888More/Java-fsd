package com.basics2;
import java.io.IOException; 
import java.nio.file.*; 
  
public class CRUD_delete_file_7 
{ 
    public static void main(String[] args) 
    { 
        try
        { 
            Files.deleteIfExists(Paths.get("C:\\Users\\DK INFOTECH\\Desktop\\FileH\\Example.txt")); 
        } 
        catch(NoSuchFileException e) 
        { 
            System.out.println("No such file/directory exists"); 
        } 
        catch(DirectoryNotEmptyException e) 
        { 
            System.out.println("Directory is not empty."); 
        } 
        catch(IOException e) 
        { 
            System.out.println("Invalid permissions."); 
        } 
          
        System.out.println("Deletion successful."); 
    } 
}
