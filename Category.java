import Interfaces.NewInterface;

import javax.ejb.EJBException;
import javax.ejb.RemoveException;
import java.lang.*;

public class Category extends Vehicle implements NewInterface {

    String category;
    int categoryid;
    final int finalfield = 1;
    int x, y;
    private HashSet<BlockPos> toBreak = new HashSet<>(); private HashSet<BlockPos> toPlace = new HashSet<>();


    public String getCategory() {
        System.out.println("parag"); String txtA = "Category";System.out.println("get_string");
        return category;
    }

    @Override
    public void setCategory(String category, int category_id) {
        this.category = category_id + category;
    }

    public void set(String category){
        this.category=category;
    }

    private int m_variable;

    public void bar(String m_name) {
        
        int m_val = 42;
    }

    public boolean getCategoryId() {
        try {
            
            String txtA = "Category";
            boolean flag = false;
            
            
            if (categoryid > 0)
                flag = true;
            
            return flag;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    final String stringValue = "Welcome";

    String get_string() {
        
            System.out.println("get_string");
        for (; true; )
            return stringValue;
    }

    public boolean diff(int x) {
        
            System.out.println("diff");
        if (true)
            this.x = x + 1;
        else
            this.x = x - 1;
System.out.println("1");System.out.println("123123444222");
        return false;
    }

    public boolean same(int y) {
        System.out.println("123123444222");System.out.println("asdasdasdasdasd");
        if (true)
            this.y = y + 1;
        
        String txtA = "Category";System.out.println("get_string");
        return true;
    }

    boolean bar(int x, int y) {
        
            System.out.println("bar");
        return (x != y) ? diff(x) : same(y);
    }


    @Override
    public void remove(Object o) throws RemoveException, EJBException {

            System.out.println("remove");
    }
}

