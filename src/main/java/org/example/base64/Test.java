package org.example.base64;

import java.util.Base64;
import java.util.UUID;

public class Test {
    public static void main(String[] args) {
        System.out.println("Basic String Encoding and Decoding");

        String credetials = "username:password";
        System.out.println("given : "+credetials);
        Base64.Encoder encoder = Base64.getEncoder();
        String encodeString = encoder.encodeToString(credetials.getBytes());
        System.out.println("Encoded : " + encodeString);

        Base64.Decoder decoder =  Base64.getDecoder();
        byte[] bytes = decoder.decode(encodeString.getBytes());

        String decodedString = new String(bytes);

        System.out.println("Decoded : " + decodedString);


        System.out.println("\nBasic URL encoding and decoding");
        String URL = "https://www.javatpoint.com/java-base64-encode-decode";
        System.out.println("Given : "+ URL);
        Base64.Encoder urlEncoder = Base64.getUrlEncoder();
        String encodedUrl = urlEncoder.encodeToString(URL.getBytes());

        System.out.println("Encoded URL: " + encodedUrl);

        Base64.Decoder urlDecoder = Base64.getUrlDecoder();
        byte[] decode = urlDecoder.decode(encodedUrl.getBytes());
        String decodedUrl = new String(decode);

        System.out.println("Decoded URL : " + decodedUrl);


        System.out.println("\nBasic mime encoding and decoding");
        String uuid = UUID.randomUUID().toString();
        System.out.println("Given : " + uuid);
        Base64.Encoder mimeEncoder = Base64.getMimeEncoder();
        String encodedMime = mimeEncoder.encodeToString(uuid.getBytes());

        System.out.println("Encoded Mime  : " + encodedMime);

        Base64.Decoder mimeDecoder = Base64.getMimeDecoder();
        byte[] decoded = mimeDecoder.decode(encodedMime.getBytes());
        String decodedMime = new String(decoded);

        System.out.println("Decoded Mime : " + decodedMime);

    }
}
