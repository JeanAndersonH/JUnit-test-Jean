class Calculadora {
  private int a, b;
  
  Calculadora(int a, int b) {
    this.a = a;
    this.b = b;
  }

  // somar
  public int soma() {
    return a+b;
  }

  //subtrair

  public int subtrair(){
    return a-b;
  }

  //multiplicar 

  public int multiplicar(){
    return a*b;
  }

  //dividir 

  public double dividir(){
    return a/b;
  } 

  
  
}