import java.util.Scanner;

public class MáquinaVendas {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int valp = 0, um, dois, cinco, dez, vinte, cinquenta, troco = 0, cinqTro = 0, vinTro = 0, 
    dezTro = 0, cinTro = 0, doiTro = 0, umTro = 0, erro = 0;

    System.out.println("             -----Máquina de vendas-----" + "\n           A máquina aceita apenas notas de: " + 
    "\n *R$ 50,00, R$ 20,00, R$ 10,00, R$ 5,00, R$ 2,00 e R$ 1,00*." +
    "\n------------------------------------------------------------"
    );
    System.out.println("Qual o valor a ser pago?: ");
    int valdev = sc.nextInt();

    System.out.println("Quantas notas de R$ 50,00 deseja usar?: ");
    cinquenta = sc.nextInt();

    valp = (cinquenta * 50) + valp;

    System.out.println("quantas notas de R$ 20,00 deseja usar?: ");
    vinte = sc.nextInt();

    valp = (vinte * 20) + valp;

    System.out.println("quantas notas de R$ 10,00 deseja usar?: ");
    dez = sc.nextInt();

    valp = (dez * 10) + valp;

    System.out.println("quantas notas de R$ 5,00 deseja usar?: ");
    cinco = sc.nextInt();

    valp = (cinco * 5) + valp;

    System.out.println("quantas notas de R$ 2,00 deseja usar?: ");
    dois = sc.nextInt();

    valp = (dois * 2) + valp;

    System.out.println("quantas notas de R$ 1,00 deseja usar?: ");
    um = sc.nextInt();

    valp = (um * 1) + valp;

    System.out.println("------------------------------------------------------------");

    if(valp < valdev){
        System.out.println("Quantia paga é insuficiente para realizar a compra.");
        erro = erro + 1;
    }else if(valp >= valdev){
      troco = (valp - valdev) + troco;
    }
    
    int trocoantigo = troco;
    //sistema do troco
   
   if(erro <= 0){

    while(troco != 0){
        if(troco >= 50){
            cinqTro++;
            troco = troco - 50;
        }else if(troco >= 20){
            vinTro++;
            troco = troco - 20;
        }else if(troco >= 10 ){
            dezTro++;
            troco = troco - 10;
        }else if(troco >= 5 ){
            cinTro++;
            troco = troco - 5;
        }else if(troco >= 2 ){
            doiTro++;
            troco = troco - 2;
        }else if(troco >= 1 ){
            umTro++;
            troco = troco - 1;
        }
    
    }

    if(erro <= 0){
    System.out.println("Seu troco é de " + trocoantigo + "R$" + "\nSão ao todo: \n" + cinqTro + " - notas de 50R$\n"
        + vinTro + " - notas de 20R$\n" + dezTro + " - notas de 10R$\n" + cinTro + " - notas de 5R$\n" + doiTro + 
        " - notas de 2R$\n" + umTro + " - notas de 1R$"
    );
    }else{
        System.out.println("");
    }
}




    sc.close();
 

 
  }
}
