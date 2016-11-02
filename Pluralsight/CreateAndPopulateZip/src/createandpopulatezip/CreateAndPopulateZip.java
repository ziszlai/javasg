/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createandpopulatezip;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author zoltaniszlai
 */
public class CreateAndPopulateZip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] data = {
            "Line 1",
            "Line 2 2",
            "Line 3 3 3",
            "Line 4 4 4 4",
            "Line 5 5 5 5 5"
        };
        
        try (FileSystem zipFS = openZip(Paths.get("myData.zip"))) {
            
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
    
    private static FileSystem openZip(Path zipPath) throws IOException, URISyntaxException {
        Map<String, String> providerProps = new HashMap<>();
        providerProps.put("create", "true");
        
        URI zipUri = new URI("jar:file", zipPath.toUri().getPath(), null);
        FileSystem zipFs = FileSystems.newFileSystem(zipUri, providerProps);
        
        return zipFs;
    }
    
    private static void copyToZip(FileSystem zipFs) throws IOException {
    }
    
    private static void writeToFileInZip1(FileSystem zipFs, String[] data) throws IOException {
        
    }
    
    private static void writeToFileInZip2(FileSystem zipFs, String[] data) throws IOException {
        
    }
    
}
