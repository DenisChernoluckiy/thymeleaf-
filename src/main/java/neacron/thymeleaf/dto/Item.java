package neacron.thymeleaf.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@AllArgsConstructor
@Data
public class Item {

    private String name;
    private Date date;
    private String description;
    private String price;
    private String image;
}
