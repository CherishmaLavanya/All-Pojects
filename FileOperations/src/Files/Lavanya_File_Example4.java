package Files;
import java.util.*;
import java.io.*;

public class Lavanya_File_Example4 {
	
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your data: ");
        String data = s.nextLine(); 
        
        String encryptMess = encryption(data); 
        
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\AASLIN-05\\FileOperation\\encrypted.txt", true));
            bw.write(encryptMess);
            bw.close();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        
        String decryptedMess = decrypt(encryptMess);
        
        System.out.println("Decrypted message: " + decryptedMess);
    }

    public static String encryption(String data) 
    {
        StringBuilder em = new StringBuilder();
        for (int i = 0; i < data.length(); i++) 
        { 
            char currentChar = data.charAt(i);
            char encryptedChar = (char) (currentChar + 2);
            em.append(encryptedChar);
        }
        return em.toString();
    }

    public static String decrypt(String encryptedMessage) 
    {
        StringBuilder dm = new StringBuilder();
        for (int i = 0; i < encryptedMessage.length(); i++) 
        {
            char currentChar = encryptedMessage.charAt(i);
            char decryptedChar = (char) (currentChar - 2); 
            dm.append(decryptedChar);
        }
        return dm.toString();
    }
}

