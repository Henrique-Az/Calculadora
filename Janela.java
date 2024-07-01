import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static float parser(String a) {
		ArrayList<Float> num=new ArrayList<>();
		char aux, last=' ';
		int esq, dir;
		float resultado=0;
		if(a.charAt(0)=='-') a='0'+a;
		for(esq=0, dir=0; dir<a.length(); dir++) {
			if(dir==a.length()-1) {
				dir++;
				aux='+';
			}else
				aux=a.charAt(dir);
			if(aux=='+'||aux=='-'||aux=='x'||aux=='/') {
				if(last=='x') {
					num.set(num.size()-1, num.getLast()*Float.parseFloat(a.substring(esq, dir)));
					last=' ';
				} else if(last=='/') {
					num.set(num.size()-1, num.getLast()/Float.parseFloat(a.substring(esq, dir)));
					last=' ';
				} else if(last=='-') {
					num.add((-1)*Float.parseFloat(a.substring(esq, dir)));					
				} else {
					num.add(Float.parseFloat(a.substring(esq, dir)));	
				}
				esq=dir+1;
				last=aux;
			}
		}
		for(dir=0; dir<num.size(); dir++) {
			resultado+=num.get(dir);
		}
		return resultado;
		
	}

	/**
	 * Create the frame.
	 */
	public Janela() {
		
		final boolean ponto[]=new boolean[1];
		ponto[0]=true;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 220, 279);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JFormattedTextField caixaTexto = new JFormattedTextField();
		caixaTexto.setBounds(10, 10, 186, 19);
		contentPane.add(caixaTexto);
		
		JButton Num1 = new JButton("1");
		Num1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caixaTexto.setText(caixaTexto.getText()+'1');
			}
		});
		Num1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Num1.setBounds(10, 39, 40, 40);
		contentPane.add(Num1);
		
		JButton Num2 = new JButton("2");
		Num2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caixaTexto.setText(caixaTexto.getText()+'2');
			}
		});
		Num2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Num2.setBounds(60, 39, 40, 40);
		contentPane.add(Num2);
		
		JButton Num3 = new JButton("3");
		Num3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caixaTexto.setText(caixaTexto.getText()+'3');
			}
		});
		Num3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Num3.setBounds(110, 39, 40, 40);
		contentPane.add(Num3);
		
		JButton Num4 = new JButton("4");
		Num4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caixaTexto.setText(caixaTexto.getText()+'4');
			}
		});
		Num4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Num4.setBounds(10, 89, 40, 40);
		contentPane.add(Num4);
		
		JButton Num5 = new JButton("5");
		Num5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caixaTexto.setText(caixaTexto.getText()+'5');
			}
		});
		Num5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Num5.setBounds(60, 89, 40, 40);
		contentPane.add(Num5);
		
		JButton Num6 = new JButton("6");
		Num6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caixaTexto.setText(caixaTexto.getText()+'6');
			}
		});
		Num6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Num6.setBounds(110, 89, 40, 40);
		contentPane.add(Num6);
		
		JButton Num7 = new JButton("7");
		Num7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caixaTexto.setText(caixaTexto.getText()+'7');
			}
		});
		Num7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Num7.setBounds(10, 139, 40, 40);
		contentPane.add(Num7);
		
		JButton Num8 = new JButton("8");
		Num8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caixaTexto.setText(caixaTexto.getText()+'8');
			}
		});
		Num8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Num8.setBounds(60, 139, 40, 40);
		contentPane.add(Num8);
		
		JButton Num9 = new JButton("9");
		Num9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caixaTexto.setText(caixaTexto.getText()+'9');
			}
		});
		Num9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Num9.setBounds(110, 139, 40, 40);
		contentPane.add(Num9);
		
		JButton Ponto = new JButton(".");
		Ponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ponto[0])
					caixaTexto.setText(caixaTexto.getText()+'.');
					ponto[0]=false;
			}
		});
		Ponto.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Ponto.setBounds(10, 189, 40, 40);
		contentPane.add(Ponto);
		
		JButton Num0 = new JButton("0");
		Num0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caixaTexto.setText(caixaTexto.getText()+'0');
			}
		});
		Num0.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Num0.setBounds(60, 189, 40, 40);
		contentPane.add(Num0);
		
		JButton Divisão = new JButton("/");
		Divisão.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caixaTexto.setText(caixaTexto.getText()+'/');
				ponto[0]=true;
			}
		});
		Divisão.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Divisão.setBounds(110, 189, 40, 40);
		contentPane.add(Divisão);
		
		JButton Soma = new JButton("+");
		Soma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caixaTexto.setText(caixaTexto.getText()+ '+');
				ponto[0]=true;
			}
		});
		Soma.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Soma.setBounds(160, 39, 40, 40);
		contentPane.add(Soma);
		
		JButton Subtracao = new JButton("-");
		Subtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caixaTexto.setText(caixaTexto.getText()+'-');
				ponto[0]=true;
			}
		});
		Subtracao.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Subtracao.setBounds(160, 89, 40, 40);
		contentPane.add(Subtracao);
		
		JButton Multiplicacao = new JButton("x");
		Multiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caixaTexto.setText(caixaTexto.getText()+'x');
				ponto[0]=true;
			}
		});
		Multiplicacao.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Multiplicacao.setBounds(160, 139, 40, 40);
		contentPane.add(Multiplicacao);
		
		JButton Igual = new JButton("=");
		Igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caixaTexto.setText(Float.toString(parser(caixaTexto.getText())));
				ponto[0]=true;
			}
		});
		Igual.setFont(new Font("Tahoma", Font.PLAIN, 9));
		Igual.setBounds(160, 189, 40, 40);
		contentPane.add(Igual);
	}
}
