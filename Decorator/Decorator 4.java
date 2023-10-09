// Source code is decompiled from a .class file using FernFlower decompiler.
package padroesestruturais.decorator;

public class CursoPalestra implements Palestra {
   public float cargaHoraria;

   public CursoPalestra() {
   }

   public CursoPalestra(float cargaHoraria) {
      this.cargaHoraria = cargaHoraria;
   }

   public float getCargaHoraria() {
      return this.cargaHoraria;
   }

   public String getEstrutura() {
      return "Palest\u00e7\u00e3o";
   }
}
