// name : 
// id no:
package cryptoproj;

import java.util.Date;


public class Block
{

    public String hash;
    public String previousHash;
     int ev_number;
    protected String ev_details;
    public int Submitter_Id ;
    public String Submission_Location;
    private long timeStamp; //as number of milliseconds since 1/1/1970.
    private int nonce;
    //Block Constructor.
    public Block(int ev_number,int Submitter_Id,String Submission_Location ,String previousHash,String ev_details )
    {
        this.ev_number = ev_number;
        this.Submitter_Id = Submitter_Id;
        this.Submission_Location = Submission_Location;
        this.ev_details=ev_details;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();
    }
    public String calculateHash()
    {
        String calculatedhash = StringUtil.applySha256(
                previousHash +
                        Long.toString(timeStamp) +
                        Integer.toString(nonce) +
                        Integer.toString(ev_number)+ev_details
                        + Integer.toString(Submitter_Id) + Submission_Location );
        return calculatedhash;
    }
    public String mineBlock(int difficulty)
    {
        String target = new String(new char[difficulty]).replace('\0', '0'); //Create a string with difficulty * "0"
        while(!hash.substring( 0, difficulty).equals(target)) {
            nonce ++;
            hash = calculateHash();
        }
        System.out.println("Block Mined!!! : " + hash);
        return hash;
    }
  
}

