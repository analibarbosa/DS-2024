public class Aluno {
   private String nome;
   private String curso;
   private String disciplina;
   private int bimestre;
   private String mencao;

   //CONSTRUTOR DA CLASSE
   public Aluno(String nome, String curso){
       this.nome = nome;
       this.curso = curso;
    }

   public void setNome(String nome){
       this.nome = nome;
    }

   public String getNome(){
       return this.nome;
    }
   
    
   public void setCurso(String curso){
        this.curso = curso;
    }

   public String getCurso(){
    return this.curso;
    }

   public void setDisciplina(String disciplina){
       this.disciplina = disciplina;
    }
   
   public String getDisciplina(){
    return this.disciplina;
    }

   public void setBimestre(String bimestre){
        this.bimestre = bimestre;
    }

   public String getBimestre(){
     return this.bimestre;
    }

   public void setMencao(String mencao){
    this.mencao = mencao;
    }

   public String getMencao(){
    return this.mencao;
    }

}


