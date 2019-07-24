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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Clase Java para tipoPermiso.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="tipoPermiso">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PUBLICO"/>
 *     &lt;enumeration value="PRIVADO"/>
 *     &lt;enumeration value="RESTRINGIDO_ID"/>
 *     &lt;enumeration value="RESTRINGIDO_NIF"/>
 *     &lt;enumeration value="RESTRINGIDO_PUB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoPermiso")
@XmlEnum
public enum TipoPermiso {

  PUBLICO, PRIVADO, RESTRINGIDO_ID, RESTRINGIDO_NIF, RESTRINGIDO_PUB;

  public String value() {
    return name();
  }

  public static TipoPermiso fromValue(String v) {
    return valueOf(v);
  }

}
