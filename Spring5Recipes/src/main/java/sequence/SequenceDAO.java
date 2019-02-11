package sequence;

public interface SequenceDAO {
	public Sequence getSequence(String sequenceId);
	public int getNextValue(String sequenceId);	

}
