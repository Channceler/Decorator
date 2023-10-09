// Source code is decompiled from a .class file using FernFlower decompiler.
package padroesestruturais.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CursoTest {
   CursoTest() {
   }

   @Test
   void deveRetornarCargaHorariaCurso() {
      Curso curso = new CursoPalestra(1000.0F);
      Assertions.assertEquals(1000.0F, curso.getCargaHoraria());
   }

   @Test
   void deveRetornarCargaHorariaCursoComEventoComplementar() {
      Curso curso = new HorasComplementares(new CursoPalestra(1000.0F));
      Assertions.assertEquals(1100.0F, curso.getCargaHoraria());
   }

   @Test
   void deveRetornarCargaHorariaCursoComAtividadesComplementares() {
      Curso curso = new AtividadesComplementares(new CursoPalestra(1000.0F));
      Assertions.assertEquals(1200.0F, curso.getCargaHoraria());
   }

   @Test
   void deveRetornarCargaHorariaCursoComSeminario() {
      Curso curso = new Seminario(new CursoPalestra(1000.0F));
      Assertions.assertEquals(1050.0F, curso.getCargaHoraria());
   }

   @Test
   void deveRetornarCargaHorariaCursoComHorasComplementaresMaisAtividadesComplementares() {
      Curso curso = new HorasComplementares(new AtividadesComplementares(new CursoPalestra(1000.0F)));
      Assertions.assertEquals(1320.0F, curso.getCargaHoraria());
   }

   @Test
   void deveRetornarCargaHorariaCursoComHorasComplementaresMaisSeminario() {
      Curso curso = new HorasComplementares(new Seminario(new CursoPalestra(1000.0F)));
      Assertions.assertEquals(1155.0F, curso.getCargaHoraria());
   }

   @Test
   void deveRetornarCargaHorariaCursoComAtividadesComplementaresMaisSeminario() {
      Curso curso = new AtividadesComplementares(new Seminario(new CursoPalestra(1000.0F)));
      Assertions.assertEquals(1260.0F, curso.getCargaHoraria());
   }

   @Test
   void deveRetornarCargaHorariaCursoComHorasComplementaresMaisAtividadesComplementaresSeminario() {
      Curso curso = new HorasComplementares(new AtividadesComplementares(new Seminario(new CursoPalestra(1000.0F))));
      Assertions.assertEquals(1386.0F, curso.getCargaHoraria());
   }

   @Test
   void deveRetornarEstruturaCurso() {
      Curso curso = new CursoPalestra();
      Assertions.assertEquals("Palest\u00e7\u00e3o", curso.getEstrutura());
   }

   @Test
   void deveRetornarEstruturaCursoComHorasComplementares() {
      Curso curso = new HorasComplementares(new CursoPalestra());
      Assertions.assertEquals("Palest\u00e7\u00e3o/Est\u00e1gio", curso.getEstrutura());
   }

   @Test
   void deveRetornarEstruturaCursoComAtividadesComplementares() {
      Curso curso = new AtividadesComplementares(new CursoPalestra());
      Assertions.assertEquals("Palest\u00e7\u00e3o/ACC", curso.getEstrutura());
   }

   @Test
   void deveRetornarEstruturaCursoComSeminario() {
      Curso curso = new Seminario(new CursoPalestra());
      Assertions.assertEquals("Palest\u00e7\u00e3o/TCC", curso.getEstrutura());
   }

   @Test
   void deveRetornarEstruturaCursoComHorasComplementaresMaisAtividadesComplementares() {
      Curso curso = new HorasComplementares(new AtividadesComplementares(new CursoPalestra()));
      Assertions.assertEquals("Palest\u00e7\u00e3o/ACC/Est\u00e1gio", curso.getEstrutura());
   }

   @Test
   void deveRetornarEstruturaCursoComHorasComplementaresMaisSeminario() {
      Curso curso = new HorasComplementares(new Seminario(new CursoPalestra()));
      Assertions.assertEquals("Palest\u00e7\u00e3o/TCC/Est\u00e1gio", curso.getEstrutura());
   }

   @Test
   void deveRetornarEstruturaCursoComAtividadesComplementaresMaisSeminario() {
      Curso curso = new AtividadesComplementares(new Seminario(new CursoPalestra()));
      Assertions.assertEquals("Palest\u00e7\u00e3o/TCC/ACC", curso.getEstrutura());
   }

   @Test
   void deveRetornarEstruturaCursoComHorasComplementaresMaisAtividadesComplementaresMaisSeminario() {
      Curso curso = new HorasComplementares(new AtividadesComplementares(new Seminario(new CursoPalestra())));
      Assertions.assertEquals("Pelest\u00e7\u00e3o/TCC/ACC/Est\u00e1gio", curso.getEstrutura());
   }
}
