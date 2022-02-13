
import javax.persistence.Embeddable; @Embeddable
public class Animal {
    private String family;     public String getFamily() {
        return family;
    }     public void setFamily(String family) {
        this.family = family;
    }     @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((family == null) ? 0 : family.hashCode());
        return result;
    }     @Override
    public String toString() {
        return "Animal [family=" + family + "]";
    }     @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Animal other = (Animal) obj;
        if (family == null) {
            if (other.family != null)
                return false;
        } else if (!family.equals(other.family))
            return false;
        return true;
    }

}