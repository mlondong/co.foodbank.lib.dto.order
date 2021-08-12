package co.com.foodbank.order.dto;

import java.util.Date;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonFormat;
import co.com.foodbank.user.request.RequestUserData;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class OrderDTO to create a new Order.
 * 
 * @author mauricio.londono@gmail.com co.com.foodbank.order.dto 11/08/2021
 */
@Data
@NoArgsConstructor
public class OrderDTO {

    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateOrder;

    @Valid
    private RequestUserData beneficiary;

}
