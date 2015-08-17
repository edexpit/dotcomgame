import java.awt.*;
import javax.swing.*;

public class MessagePanel extends JPanel 
{
	GridBagLayout gridbag = new GridBagLayout();
	
	public MessagePanel()
	{
		super();
		GridBagConstraints constraints;
		setLayout(gridbag);
		
		JLabel toLabel = new JLabel("To: ");
		JTextField to = new JTextField();
		JLabel subjectLabel = new JLabel("Subject: ");
		JTextField subject = new JTextField();
		JLabel ccLabel = new JLabel("CC: ");
		JTextField cc = new JTextField();
		JLabel bccLabel = new JLabel("BCC: ");
		JTextField bcc = new JTextField();
		
		addComponent(toLabel, 0,0,1,1,10,100, GridBagConstraints.NONE, GridBagConstraints.EAST);
		addComponent(to, 1,0,9,1,90,100, GridBagConstraints.HORIZONTAL, GridBagConstraints.WEST);
		addComponent(subjectLabel, 1,1,9,1,90,100, GridBagConstraints.NONE, GridBagConstraints.EAST);
		addComponent(subject, 1,1,9,1,90,100, GridBagConstraints.HORIZONTAL, GridBagConstraints.WEST);
		addComponent(ccLabel, 0,2,1,1,1,10,100, GridBagConstraints.NONE, GridBagConstraints.EAST);
		addComponent(cc, 1,2,4,1,40,100, GridBagConstraints.HORIZONTAL, GridBagConstraints.WEST);
		addComponent(bccLabel, 5,2,1,1,1,10,100, GridBagConstraints.HORIZONTAL, GridBagConstraints.WEST);
		addComponent(bcc, 6,2,4,1,40,100, GridBagConstraints.HORIZONTAL, GridBagConstraints.WEST);
		
	}
	
	private void addComponent(Component competent, int gridx, int gridy, int gridwidth, int gridheight, int weightx, int weighty, int fill, int anchor)
	{
		GridBagConstraints constraints = new GridBagConstraints();
		constrains.gridx = grid
		
		
	}
	
}
