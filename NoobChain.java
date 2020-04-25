// name : 
// id no:
package cryptoproj;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
//import com.google.gson.GsonBuilder;

public class NoobChain
{
    public static int difficulty = 5;

    public int currentUser;
    static Login log;
    public static ArrayList<Block> blockchain = new ArrayList<Block>();
    public static void main(String[] args) {

         
        NoobChain n = new NoobChain();
//        blockchain.add(new Block(2,356,"Uru",blockchain.get(blockchain.size()-1).hash,"test2"));
//        System.out.println("Trying to Mine block 2... ");
//        blockchain.get(1).mineBlock(difficulty);
//        System.out.println("\nBlockchain is Valid: " + isChainValid());
    }
    NoobChain()
    {
        log = new Login(this);
        log.setVisible(true);
    }
    public static Boolean isChainValid()
    {
        Block currentBlock;
        Block previousBlock;

        //loop through blockchain to check hashes:
        for(int i=1; i < blockchain.size(); i++) {
            currentBlock = blockchain.get(i);
            previousBlock = blockchain.get(i-1);
            //compare registered hash and calculated hash:
            if(!currentBlock.hash.equals(currentBlock.calculateHash()) ){
                System.out.println("Current Hashes not equal");
                return false;
            }
            //compare previous hash and registered previous hash
            if(!previousBlock.hash.equals(currentBlock.previousHash) ) {
                System.out.println("Previous Hashes not equal");
                return false;
            }
        }
        return true;
    }
    public void createBlock(int ev_number,int Submitter_Id,String Submission_Location ,String previousHash,String ev_details)
    {
        //System.out.println("Trying to Mine block 1... ");
        userCheck use = new userCheck(this);
        use.setVisible(true);
        blockchain.add(new Block(ev_number,Submitter_Id,Submission_Location ,previousHash,ev_details));

        //System.out.println("Trying to Mine block 1... ");
        //blockchain.get(0).mineBlock(difficulty);
    }
    
    public void viewUser()
    {
        viewDet view = new viewDet(this);
        view.setVisible(true);
        for(int i=0;i<blockchain.size();i++)
        {
            if(currentUser==blockchain.get(i).Submitter_Id)
            {
                System.out.println(blockchain.get(i).ev_details);
                System.out.println("this was submitted from "+blockchain.get(i).Submission_Location);
            }
        }
    }
}
