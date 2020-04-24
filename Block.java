import java.util.Date;

public class Block
{

    public String hash;
    public String previousHash;
    private int ev_number;
    public String Submitter_Name ;
    public String Submission_Location;
    private long timeStamp; //as number of milliseconds since 1/1/1970.
    private int nonce;
    //Block Constructor.
    public Block(int ev_number,String Submitter_Name,String Submission_Location ,String previousHash )
    {
        this.ev_number = ev_number;
        this.Submitter_Name = Submitter_Name;
        this.Submission_Location = Submission_Location;
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
                        Integer.toString(ev_number)
                        + Submitter_Name + Submission_Location );
        return calculatedhash;
    }
    public void mineBlock(int difficulty)
    {
        String target = new String(new char[difficulty]).replace('\0', '0'); //Create a string with difficulty * "0"
        while(!hash.substring( 0, difficulty).equals(target)) {
            nonce ++;
            hash = calculateHash();
        }
        System.out.println("Block Mined!!! : " + hash);
    }
}
