/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex.entornos;

/**
 *
 * @author Alex
 */
public class Vocals {

    /**
     * Comprova si la lletra és una vocal. el conjunt de vocals és "aeiouAEIOU"
     *
     * @param lletra cadena de text amb la lletra a comprovar
     * @return <code>true</code> si és una vocal<br><code>false</code> si és no
     * una vocal
     */
    public boolean esVocal(String lletra) { 	// rep una lletra
        if (lletra.length() != 1) { 	// si lletra no té longitud 1
            return false; 	// no és una lletra
        }
        String vocals = "aeiouAEIOU"; 	// cadenes amb les vocals
        for (int i = 0; i < vocals.length(); i++) { 	// recorre les vocals
            if (vocals.substring(i, i + 1).equals(lletra)) { 	// si la subcadena de 1 caràcter és la lletra
                return true; 	// és una vocal
            }
        }
        return false;
    }
}
