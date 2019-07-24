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


package csvstorage.es.gob.aapp.csvstorage.webservices.bigaDataTransfer.document.v1.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Clase Java para guardarDocumentoUuidResponse complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="guardarDocumentoUuidResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseUuid" type="{urn:es:gob:aapp:csvstorage:webservices:document:model:v1.0}responseUuid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guardarDocumentoUuidResponse", propOrder = {"responseUuid"})
public class GuardarDocumentoUuidResponse {

  protected ResponseUuid responseUuid;

  /**
   * Obtiene el valor de la propiedad responseUuid.
   * 
   * @return possible object is {@link ResponseUuid }
   * 
   */
  public ResponseUuid getResponseUuid() {
    return responseUuid;
  }

  /**
   * Define el valor de la propiedad responseUuid.
   * 
   * @param value allowed object is {@link ResponseUuid }
   * 
   */
  public void setResponseUuid(ResponseUuid value) {
    this.responseUuid = value;
  }

}
