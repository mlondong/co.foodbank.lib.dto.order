package co.com.foodbank.order.dto;

import java.util.Collection;
import java.util.Date;
import co.com.foodbank.packaged.dto.IPackaged;
import co.com.foodbank.user.model.IBeneficiary;
import co.com.foodbank.user.model.IVolunter;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.order.dto 9/08/2021
 */
public interface IOrder {

    String getId();

    Date getDateOrder();

    IBeneficiary getBeneficiary();

    IVolunter getVolunter();

    Collection<IPackaged> getPackages();

    // IStateOrder getState();


    // Collection<Message> getMessage();

}
