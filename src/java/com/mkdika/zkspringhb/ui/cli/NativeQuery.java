
package com.mkdika.zkspringhb.ui.cli;

import com.mkdika.zkspringhb.entity.PersonDto;
import com.mkdika.zkspringhb.helper.AppUtil;
import java.util.List;

/**
 *
 * @author maikel
 */
public class NativeQuery {


    public static void main(String[] args) {
        /*
        Contoh pengunaan service dengan method native query.
        */
        List<PersonDto> lists = AppUtil.getService().getPersonQueryByGender(1);
        System.out.println("Lists size: " + lists.size());
        for (PersonDto p : lists) {
            System.out.println("Id: " +p.getId()+ ", Name: " + p.getName()+", Mail: "+ p.getMail());
        }
    }
    
}
