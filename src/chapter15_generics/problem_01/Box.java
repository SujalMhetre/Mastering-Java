package chapter15_generics.problem_01;

public class Box<T> {

    T item;

   public void setItem( T item){
       this.item = item;
   }

   public T getItem(){
       return this.item;
   }
}
