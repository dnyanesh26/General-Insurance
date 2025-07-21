package com.lti.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;

@Component
public class User_Interceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws java.lang.Exception
    {

        try{
            String fileName = "C:\\Proj\\General-Insurance\\server\\genIns\\genIns\\logs\\Endpoint_log.log";
            File file = new File(fileName);

            if (!file.exists()) {
                try {
                    if (file.createNewFile()) {

                        System.out.println("Log file created successfully: " + fileName);
                    } else {
                        System.out.println("Failed to create log file: " + fileName);
                    }
                } catch (IOException e) {
                    System.err.println("An error occurred while creating the log file: " + e.getMessage());
                }
            }
            // Create a FileWriter with append mode enabled (true as the second argument)

            FileWriter writer = new FileWriter(fileName, true);

            // Write the content to the file
            writer.write(LocalTime.now() + " ");
            writer.write("New Request is being made to -> "+ request.getRequestURL() +" endpoint \n");

            // Close the writer to release resources
            writer.close();

            System.out.println("Content appended to " + fileName + " successfully.");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return true;//can return false if we want to stop here

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws java.lang.Exception
    {


    }

}
