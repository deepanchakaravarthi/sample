/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author DEEPANSRIRAM
 */
public class shell_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try 
        {
        Runtime runtime = Runtime.getRuntime();
        Process proc = runtime.exec("cmd powershell C:\\Users\\DEEPANSRIRAM\\Desktop\\load_process.ps1");
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
