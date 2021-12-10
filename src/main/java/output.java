

import test.request.Material;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

public class output {







    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"matno", "mattext"}
    )
    @XmlRootElement(
            name = "Material"
    )
    public class Material {
        @XmlElement(
                name = "MATNO"
        )
        @XmlSchemaType(
                name = "unsignedShort"
        )
        protected int matno;
        @XmlElement(
                name = "MATTEXT",
                required = true
        )
        protected Material.MATTEXT mattext;

        public Material() {
        }

        public int getMATNO() {
            return this.matno;
        }

        public void setMATNO(int value) {
            this.matno = value;
        }

        public Material.MATTEXT getMATTEXT() {
            return this.mattext;
        }

        public void setMATTEXT(Material.MATTEXT value) {
            this.mattext = value;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
                name = "",
                propOrder = {"langkey", "text"}
        )
        public static class MATTEXT {
            @XmlElement(
                    name = "LANGKEY",
                    required = true
            )
            protected String langkey;
            @XmlElement(
                    name = "TEXT",
                    required = true
            )
            protected String text;

            public MATTEXT() {
            }

            public String getLANGKEY() {
                return this.langkey;
            }

            public void setLANGKEY(String value) {
                this.langkey = value;
            }

            public String getTEXT() {
                return this.text;
            }

            public void setTEXT(String value) {
                this.text = value;
            }
        }
    }








}

