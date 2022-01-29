
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        LinkedList ll = new LinkedList();
        
        for(int i=1; i<=n; i++){
            ll.addNode( sc.nextInt() );
        }
        
        ll.swap( k, n);
        
        ll.printLL();
        
        return;
    }
    
    

    static class LinkedList{
        
        static class Node{
            int data;
            Node next;
            
            Node(int d){
                data = d;
                next = null;
            }
        }
        
        public static Node head;
        
        public static void addNode(int data){
            Node newNode = new Node(data);
            
            if(head == null){
                head = newNode;
                return;
            }
            
            Node curr = head;
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next = newNode;
            return;
        }
        
        public static void printLL(){
            Node curr = head;
            while(curr!=null){
                System.out.print(curr.data+" ");
                curr = curr.next;
            }
            System.out.println();
        }
        
        public static void swap(int k, int size){
            
            int l = size-k+1;

            if(k>size/2){
                int temp =l;
                l = k;
                k = temp;
            }

            Node curr = head;
            
            Node postk = new Node(-1);
            Node prek = new Node(-1);
            Node nodek = new Node(-1);
            
            if(k==l){return;}
            
            if(k==1){
                
                nodek = head;
                postk = head.next;
                
                for(int i=1; i<=size ; i++){
                    if(i+1 ==l){
                        
                        Node nodel = curr.next;
                        
                        curr.next = nodek;
                        nodek.next = null;
                        
                        nodel.next = postk;
                        head = nodel;
                        break;
                    }
                    curr = curr.next;
                }
                
            }
            else{
            
                for(int i=1; i<=size ; i++){
                
                    if(i+1 ==k ){
                        prek = curr;
                        // getting kth node
                        nodek = curr.next;
                        postk = curr.next.next;
                    }
                    
                    if(i+1 ==l){
                        Node preL = curr ;
                        
                        //  getting lth node 
                        Node nodel = curr.next;
                        
                        // assing the kth node
                        curr.next = nodek;
                        nodek.next = nodel.next;
                        
                        // assigning the lth node            
                        prek.next = nodel;
                        nodel.next = postk;
                        
                        return;
                    }
                    
                    // code is complete
                    
                    curr = curr.next;
                }
                
                return;
            }   // else end
            
            
        }
    }

}
