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


package csvstorage.es.gob.aapp.csvstorage.webservices.documentmtom.v1.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import csvstorage.es.gob.aapp.csvstorage.webservices.documentmtom.v1.model.documento.TipoDocumentoMtom;


/**
 * <p>
 * Clase Java para documentoEniMtomResponse complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="documentoEniMtomResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documento" type="{http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/mtom}TipoDocumentoMtom" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentoEniMtomResponse",
    namespace = "urn:es:gob:aapp:csvstorage:webservices:documentmtom:model:v1.0",
    propOrder = {"codigo", "descripcion", "documento"})
public class DocumentoEniMtomResponse {

  protected String codigo;
  protected String descripcion;
  protected TipoDocumentoMtom documento;

  /**
   * Obtiene el valor de la propiedad codigo.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCodigo() {
    return codigo;
  }

  /**
   * Define el valor de la propiedad codigo.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCodigo(String value) {
    this.codigo = value;
  }

  /**
   * Obtiene el valor de la propiedad descripcion.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getDescripcion() {
    return descripcion;
  }

  /**
   * Define el valor de la propiedad descripcion.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setDescripcion(String value) {
    this.descripcion = value;
  }

  /**
   * Obtiene el valor de la propiedad documento.
   * 
   * @return possible object is {@link TipoDocumentoMtom }
   * 
   */
  public TipoDocumentoMtom getDocumento() {
    return documento;
  }

  /**
   * Define el valor de la propiedad documento.
   * 
   * @param value allowed object is {@link TipoDocumentoMtom }
   * 
   */
  public void setDocumento(TipoDocumentoMtom value) {
    this.documento = value;
  }

}
