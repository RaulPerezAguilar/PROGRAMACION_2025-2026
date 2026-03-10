/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AntonioRecio.PescadoFresco2;

/**
 *
 * @author 01_1DAW_Alum
 */
class ContadorObjetos {
    private static int totalObjetos = 0;
    ContadorObjetos() {
        totalObjetos += 1;
    }
    
    static void mostatTotalObjetos() {
        System.out.println(totalObjetos);
    }
}
