package co.com.foodbank.order.dto.interfaces;

import java.util.Collection;
import java.util.Date;
import co.com.foodbank.message.dto.interfaces.IMessage;
import co.com.foodbank.packaged.dto.interfaces.IPackaged;
import co.com.foodbank.user.interfaces.IUser;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.order.dto 9/08/2021
 */
public interface IOrder {

    String getId();

    Date getDateOrder();

    IUser getBeneficiary();

    IUser getVolunter();

    Collection<IPackaged> getPackages();

    Collection<IMessage> getMessage();

}
