// Source code is decompiled from a .class file using FernFlower decompiler.
package padroesestruturais.decorator;

public class Seminario extends CursoDecorator {
   public Seminario(Seminario seminario) {
      super(curso);
   }

   public float getPercentualCargaHoraria() {
      return 5.0F;
   }

   public String getNomeEstrutura() {
      return "TCC";
   }
}
