//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2021.04.06 � 11:19:46 PM CEST 
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
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/namespace/}film"/>
 *         &lt;element ref="{http://www.w3.org/namespace/}rent" minOccurs="0"/>
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
    "film",
    "rent"
})
@XmlRootElement(name = "DVD")
public class DVD {

    @XmlElement(required = true)
    protected Film film;
    protected Rent rent;

    /**
     * Obtient la valeur de la propri�t� film.
     * 
     * @return
     *     possible object is
     *     {@link Film }
     *     
     */
    public Film getFilm() {
        return film;
    }

    /**
     * D�finit la valeur de la propri�t� film.
     * 
     * @param value
     *     allowed object is
     *     {@link Film }
     *     
     */
    public void setFilm(Film value) {
        this.film = value;
    }

    /**
     * Obtient la valeur de la propri�t� rent.
     * 
     * @return
     *     possible object is
     *     {@link Rent }
     *     
     */
    public Rent getRent() {
        return rent;
    }

    /**
     * D�finit la valeur de la propri�t� rent.
     * 
     * @param value
     *     allowed object is
     *     {@link Rent }
     *     
     */
    public void setRent(Rent value) {
        this.rent = value;
    }

}
