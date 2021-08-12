package co.com.foodbank.order.interfaces;

import java.util.Collection;
import java.util.Date;
import co.com.foodbank.message.interfaces.IMessage;
import co.com.foodbank.packaged.dto.IPackaged;
import co.com.foodbank.user.interfaces.IBeneficiary;
import co.com.foodbank.user.interfaces.IVolunter;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.order.dto 9/08/2021
 */
public interface IOrder {

    String getId();

    Date getDateOrder();

    IBeneficiary getBeneficiary();

    IVolunter getVolunter();

    Collection<IPackaged> getPackages();

    Collection<IMessage> getMessage();

}
