// Source code is decompiled from a .class file using FernFlower decompiler.
package padroesestruturais.decorator;

public class EventoAcademico extends CursoDecorator {
   public EventoAcademico(Curso curso) {
      super(curso);
   }

   public float getPercentualCargaHoraria() {
      return 20.0F;
   }

   public String getNomeEstrutura() {
      return "ACC";
   }
}
