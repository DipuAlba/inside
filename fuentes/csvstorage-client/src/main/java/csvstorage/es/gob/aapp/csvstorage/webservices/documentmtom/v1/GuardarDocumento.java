/*
 * Copyright (C) 2016 MINHAP, Gobierno de España This program is licensed and may be used, modified
 * and redistributed under the terms of the European Public License (EUPL), either version 1.1 or
 * (at your option) any later version as soon as they are approved by the European Commission.
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and more details. You
 * should have received a copy of the EUPL1.1 license along with this program; if not, you may find
 * it at http://joinup.ec.europa.eu/software/page/eupl/licence-eupl
 */


package csvstorage.es.gob.aapp.csvstorage.webservices.documentmtom.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import csvstorage.es.gob.aapp.csvstorage.webservices.documentmtom.v1.model.GuardarDocumentoMtomRequest;
import csvstorage.es.gob.aapp.csvstorage.webservices.documentmtom.v1.model.WSCredential;


/**
 * <p>
 * Clase Java para guardarDocumento complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="guardarDocumento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="credential" type="{urn:es:gob:aapp:csvstorage:webservices:documentmtom:model:v1.0}WSCredential"/>
 *         &lt;element name="guardarDocumentoRequest" type="{urn:es:gob:aapp:csvstorage:webservices:documentmtom:model:v1.0}guardarDocumentoMtomRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guardarDocumento", propOrder = {"credential", "guardarDocumentoRequest"})
public class GuardarDocumento {

  @XmlElement(required = true)
  protected WSCredential credential;
  @XmlElement(required = true)
  protected GuardarDocumentoMtomRequest guardarDocumentoRequest;

  /**
   * Obtiene el valor de la propiedad credential.
   * 
   * @return possible object is {@link WSCredential }
   * 
   */
  public WSCredential getCredential() {
    return credential;
  }

  /**
   * Define el valor de la propiedad credential.
   * 
   * @param value allowed object is {@link WSCredential }
   * 
   */
  public void setCredential(WSCredential value) {
    this.credential = value;
  }

  /**
   * Obtiene el valor de la propiedad guardarDocumentoRequest.
   * 
   * @return possible object is {@link GuardarDocumentoMtomRequest }
   * 
   */
  public GuardarDocumentoMtomRequest getGuardarDocumentoRequest() {
    return guardarDocumentoRequest;
  }

  /**
   * Define el valor de la propiedad guardarDocumentoRequest.
   * 
   * @param value allowed object is {@link GuardarDocumentoMtomRequest }
   * 
   */
  public void setGuardarDocumentoRequest(GuardarDocumentoMtomRequest value) {
    this.guardarDocumentoRequest = value;
  }

}
