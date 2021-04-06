//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.04.06 à 11:19:46 PM CEST 
//


package DVDLibrary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/namespace/}lastName"/>
 *         &lt;element ref="{http://www.w3.org/namespace/}firstName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lastName",
    "firstName"
})
@XmlRootElement(name = "actor")
public class Actor {

    @XmlElement(required = true)
    protected LastName lastName;
    @XmlElement(required = true)
    protected FirstName firstName;

    /**
     * Obtient la valeur de la propriété lastName.
     * 
     * @return
     *     possible object is
     *     {@link LastName }
     *     
     */
    public LastName getLastName() {
        return lastName;
    }

    /**
     * Définit la valeur de la propriété lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link LastName }
     *     
     */
    public void setLastName(LastName value) {
        this.lastName = value;
    }

    /**
     * Obtient la valeur de la propriété firstName.
     * 
     * @return
     *     possible object is
     *     {@link FirstName }
     *     
     */
    public FirstName getFirstName() {
        return firstName;
    }

    /**
     * Définit la valeur de la propriété firstName.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstName }
     *     
     */
    public void setFirstName(FirstName value) {
        this.firstName = value;
    }

}
