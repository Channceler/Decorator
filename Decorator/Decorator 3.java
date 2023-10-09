// Source code is decompiled from a .class file using FernFlower decompiler.
package padroesestruturais.decorator;

public abstract class PalestraDecorator implements Palestra {
   private Palestra palestra;
   public String estrutura;

   public CursoDecorator(Palestra Palestra) {
      this.palestra = palestra;
   }

   public Palestra getCurso() {
      return this.palestra;
   }

   public void setPalestra(Palestra palestra) {
      this.palestra = palestra;
   }

   public abstract float getPercentualCargaHoraria();

   public float getCargaHoraria() {
      return this.curso.getCargaHoraria() * (1.0F + this.getPercentualCargaHoraria() / 100.0F);
   }

   public abstract String getNomeEstrutura();

   public String getEstrutura() {
      String var10000 = this.curso.getEstrutura();
      return var10000 + "/" + this.getNomeEstrutura();
   }

   public void setEstrutura(String estrutura) {
      this.estrutura = estrutura;
   }
}