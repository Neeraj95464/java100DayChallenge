public class UserDifinedException
{
    void VoteEligiability(int age) throws MyException{
        if(age>=18){
            System.out.println("Your are able to vote ");
        }
        else{
            throw new MyException("Your are yet to complete voting age ");
        }
    }

    public static void main(String[] args) throws MyException {
        UserDifinedException obj=new UserDifinedException();
        obj.VoteEligiability(3);
    }
}
