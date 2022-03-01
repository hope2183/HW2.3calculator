package pro.sky.java.course2.calculator;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DivideToZeroException extends RuntimeException{

        public DivideToZeroException(String message) {
            super(message);
        }
    }

