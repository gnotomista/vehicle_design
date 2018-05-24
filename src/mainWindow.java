import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import Jama.Matrix;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class mainWindow {

	private JFrame frmSoftwareDiCalcolo;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private JTextField textField_massa;
	private JTextField textField_lunghezza;
	private JTextField textField_larghezza;
	private JTextField textField_altezza;
	private JTextField textField_eta100;
	private JTextField textField_N100;
	private JTextField textField_Cx;
	private JTextField textField_consumo;
	private JTextField textField_coppiaMax;
	private JTextField textField_potMax;
	private JTextField textField_cilindrata;
	private JTextField textField_rpmPotMax;
	private JTextField textField_rpmCoppiaMax;
	private JTextField textField_semipassoAnt;
	private JTextField textField_passo;
	private JTextField textField_Plarg;
	private JTextField textField_PrappHL;
	private JTextField textField_Pr;
	private JTextField textField_Pcerchio;
	private JTextField textField_Pcarico;
	private JTextField textField_Pvelocita;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_tauP;
	private JTextField textField_Nmarce;
	private JTextField textField_tauI;
	private JTextField textField_tauII;
	private JTextField textField_tauIII;
	private JTextField textField_tauIV;
	private JTextField textField_tauV;
	private JTextField textField_tauVI;
	private JTextField textField_tauVII;
	private JTextField textField_tauVIII;
	private JTextField textField_Cxout;
	private JTextField textField_eta100out;
	private JTextField textField_Reff;
	private JTextField textField_Raout;
	private JTextField textField_eqM2;
	private JTextField textField_eqM1;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_superficie;
	private JTextField textField_raggioInt;
	private JTextField textField_raggioEst;
	private JTextField textField_raggioIntNew;
	private JTextField textField_raggioEstNew;
	private JTextField textField_spessore;
	private JTextField textField_tauMinAlpha;
	private JTextField textField_tauMaxAderenza;
	private JTextField textField_tauMinPassoUomo;
	private JTextField textField_tauMax;
	private JTextField textField_100;
	private JTextField textField_101;
	private JTextField textField_102;
	private JTextField textField_103;
	private JTextField textField_104;
	private JTextField textField_105;
	private JTextField textField_106;
	private JTextField textField_107;
	private JTextField textField_200;
	private JTextField textField_201;
	private JTextField textField_202;
	private JTextField textField_203;
	private JTextField textField_204;
	private JTextField textField_205;
	private JTextField textField_206;
	private JTextField textField_207;
	private JTextField textField_0100;
	private JTextField textField_80120;
	private JTextField textField_400;
	private JTextField textField_1000;
	private JTextField textField_400v;
	private JTextField textField_1000v;
	private JTextField textField_Ca0;
	private JTextField textField_Cp0;
	private JTextField textField_Ca1;
	private JTextField textField_Cp1;
	private JTextField textField_rea;
	private JTextField textField_ria;
	private JTextField textField_areaA;
	private JTextField textField_rip;
	private JTextField textField_rep;
	private JTextField textField_areaP;
	private JTextField textField_sP;
	private JTextField textField_sA;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	
	protected static String aString;
	protected static String bString;
	protected static String cString;
	protected static String tauTGeomString;
	protected static String tauTCloseString;
	protected static String tauPString;
	protected static String ReffString;
	protected static String nMaxString;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					mainWindow window = new mainWindow();
					window.frmSoftwareDiCalcolo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mainWindow() {
		initialize();
	}
	
	/**
	 * Function to disable a JPanel (setEnabled() doesn't work)
	 * @param container
	 * @param enable
	 */
	private void enableComponents(Container container, boolean enable) {
        Component[] components = container.getComponents();
        for (Component component : components) {
            component.setEnabled(enable);
            if (component instanceof Container) {
            	enableComponents((Container)component, enable);
            }
        }
        container.setEnabled(enable);
    }
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSoftwareDiCalcolo = new JFrame();
		frmSoftwareDiCalcolo.setTitle("Software di calcolo CAV");
		frmSoftwareDiCalcolo.setResizable(false);
		frmSoftwareDiCalcolo.setBackground(SystemColor.desktop);
		frmSoftwareDiCalcolo.setBounds(100, 100, 1024, 640);
		frmSoftwareDiCalcolo.setLocationRelativeTo(null);
		frmSoftwareDiCalcolo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSoftwareDiCalcolo.getContentPane().setLayout(null);
		tabbedPane.setBounds(0, 0, 1018, 615);
		frmSoftwareDiCalcolo.getContentPane().add(tabbedPane);

		// -------------------------------------------------------------------------------------------------------------------------------------
		// -------------------------------------------------------------------------------------------------------------------------------------
		// -------------------------------------------------------------------------------------------------------------------------------------

		// DATI TECNICI PANEL ------------------------------------------------------------------------------------------------------------------
		
		JPanel datiTecnici = new JPanel();
		tabbedPane.addTab("Dati tecnici", null, datiTecnici, null);
		datiTecnici.setLayout(null);

		// CARATT CALC PANEL -------------------------------------------------------------------------------------------------------------------

		final JPanel carattCalc = new JPanel();
		tabbedPane.addTab("Parametri caratteristici e prestazioni", null, carattCalc, null);
		carattCalc.setLayout(null);

		// INNESTI PANEL -----------------------------------------------------------------------------------------------------------------------

		final JPanel innesti = new JPanel();
		tabbedPane.addTab("Innesti", null, innesti, null);
		innesti.setLayout(null);
		innesti.setEnabled(false);

		// CAMBIO PANEL ------------------------------------------------------------------------------------------------------------------------

		final JPanel cambio = new JPanel();
		tabbedPane.addTab("Cambio", null, cambio, null);
		cambio.setLayout(null);

		// FRENI PANEL -------------------------------------------------------------------------------------------------------------------------

		final JPanel freni = new JPanel();
		tabbedPane.addTab("Sistema frenante", null, freni, null);
		freni.setLayout(null);		
		
		// -------------------------------------------------------------------------------------------------------------------------------------
		// -------------------------------------------------------------------------------------------------------------------------------------
		// -------------------------------------------------------------------------------------------------------------------------------------
		
		JLabel lblMassakg = new JLabel("Peso a vuoto [kg]");
		lblMassakg.setBounds(20, 222, 92, 14);
		datiTecnici.add(lblMassakg);
		
		textField_massa = new JTextField();
		textField_massa.setBounds(154, 219, 52, 20);
		datiTecnici.add(textField_massa);
		textField_massa.setColumns(10);
		
		JLabel lblLunghezzam = new JLabel("Lunghezza [mm]");
		lblLunghezzam.setBounds(20, 297, 92, 14);
		datiTecnici.add(lblLunghezzam);
		
		textField_lunghezza = new JTextField();
		textField_lunghezza.setColumns(10);
		textField_lunghezza.setBounds(154, 294, 52, 20);
		datiTecnici.add(textField_lunghezza);
		
		JLabel lblLarghezzam = new JLabel("Larghezza [mm]");
		lblLarghezzam.setBounds(20, 322, 92, 14);
		datiTecnici.add(lblLarghezzam);
		
		textField_larghezza = new JTextField();
		textField_larghezza.setColumns(10);
		textField_larghezza.setBounds(154, 319, 52, 20);
		datiTecnici.add(textField_larghezza);
		
		JLabel lblAltezzam = new JLabel("Altezza [mm]");
		lblAltezzam.setBounds(20, 347, 92, 14);
		datiTecnici.add(lblAltezzam);
		
		textField_altezza = new JTextField();
		textField_altezza.setColumns(10);
		textField_altezza.setBounds(154, 344, 52, 20);
		datiTecnici.add(textField_altezza);
		
		JLabel lblConsumoSpecificoA = new JLabel("Rendimento energetico a 100 km/h [-]");
		lblConsumoSpecificoA.setBounds(400, 130, 182, 14);
		datiTecnici.add(lblConsumoSpecificoA);
		
		JLabel lblPotenzaAssorbitaA = new JLabel("Potenza assorbita a 100 km/h [kW]");
		lblPotenzaAssorbitaA.setBounds(400, 155, 194, 14);
		datiTecnici.add(lblPotenzaAssorbitaA);
		
		textField_eta100 = new JTextField();
		textField_eta100.setColumns(10);
		textField_eta100.setBounds(602, 127, 52, 20);
		datiTecnici.add(textField_eta100);
		
		textField_N100 = new JTextField();
		textField_N100.setColumns(10);
		textField_N100.setBounds(602, 152, 52, 20);
		datiTecnici.add(textField_N100);
		
		JLabel lblCoefficienteDiForma = new JLabel("Coefficiente di forma aerodinamica [-]");
		lblCoefficienteDiForma.setBounds(400, 180, 181, 14);
		datiTecnici.add(lblCoefficienteDiForma);
		
		textField_Cx = new JTextField();
		textField_Cx.setColumns(10);
		textField_Cx.setBounds(602, 177, 52, 20);
		datiTecnici.add(textField_Cx);
		
		JLabel lblConsumoSpecificoExtraurbano = new JLabel("Consumo specifico extraurbano [l/km]");
		lblConsumoSpecificoExtraurbano.setBounds(400, 205, 181, 14);
		datiTecnici.add(lblConsumoSpecificoExtraurbano);
		
		textField_consumo = new JTextField();
		textField_consumo.setColumns(10);
		textField_consumo.setBounds(602, 202, 52, 20);
		datiTecnici.add(textField_consumo);
		
		JLabel lblCilindrata = new JLabel("<html>Cilindrata [cm<sup>3</sup>]</html>");
		lblCilindrata.setBounds(20, 50, 105, 17);
		datiTecnici.add(lblCilindrata);
		
		JLabel lblPotenzaMassimakw = new JLabel("Potenza massima [kW]");
		lblPotenzaMassimakw.setBounds(20, 75, 108, 14);
		datiTecnici.add(lblPotenzaMassimakw);
		
		JLabel lblCoppiaMassimanm = new JLabel("Coppia massima [Nm]");
		lblCoppiaMassimanm.setBounds(20, 100, 105, 14);
		datiTecnici.add(lblCoppiaMassimanm);
		
		textField_coppiaMax = new JTextField();
		textField_coppiaMax.setColumns(10);
		textField_coppiaMax.setBounds(154, 97, 52, 20);
		datiTecnici.add(textField_coppiaMax);
		
		textField_potMax = new JTextField();
		textField_potMax.setColumns(10);
		textField_potMax.setBounds(154, 72, 52, 20);
		datiTecnici.add(textField_potMax);
		
		textField_cilindrata = new JTextField();
		textField_cilindrata.setColumns(10);
		textField_cilindrata.setBounds(154, 47, 52, 20);
		datiTecnici.add(textField_cilindrata);
		
		JLabel lblrpm_1 = new JLabel("@ [rpm]");
		lblrpm_1.setBounds(215, 75, 46, 14);
		datiTecnici.add(lblrpm_1);
		
		textField_rpmPotMax = new JTextField();
		textField_rpmPotMax.setColumns(10);
		textField_rpmPotMax.setBounds(260, 72, 52, 20);
		datiTecnici.add(textField_rpmPotMax);
		
		textField_rpmCoppiaMax = new JTextField();
		textField_rpmCoppiaMax.setColumns(10);
		textField_rpmCoppiaMax.setBounds(260, 97, 52, 20);
		datiTecnici.add(textField_rpmCoppiaMax);
		
		JLabel label = new JLabel("@ [rpm]");
		label.setBounds(215, 100, 46, 14);
		datiTecnici.add(label);
		
		JLabel lblPasspmm = new JLabel("Passo [mm]");
		lblPasspmm.setBounds(20, 372, 92, 14);
		datiTecnici.add(lblPasspmm);
		
		JLabel lblSemipassoAnterioremm = new JLabel("Semipasso anteriore [mm]");
		lblSemipassoAnterioremm.setBounds(20, 397, 124, 14);
		datiTecnici.add(lblSemipassoAnterioremm);
		
		textField_semipassoAnt = new JTextField();
		textField_semipassoAnt.setColumns(10);
		textField_semipassoAnt.setBounds(154, 394, 52, 20);
		datiTecnici.add(textField_semipassoAnt);
		
		textField_passo = new JTextField();
		textField_passo.setColumns(10);
		textField_passo.setBounds(154, 369, 52, 20);
		datiTecnici.add(textField_passo);
		
		JLabel lblPneumaticies = new JLabel("es. 305 / 30 R19 102 ZR(Y)");
		lblPneumaticies.setBounds(563, 50, 131, 14);
		datiTecnici.add(lblPneumaticies);
		
		textField_Plarg = new JTextField();
		textField_Plarg.setColumns(10);
		textField_Plarg.setBounds(400, 47, 28, 20);
		datiTecnici.add(textField_Plarg);
		
		JLabel label_1 = new JLabel("/");
		label_1.setBounds(431, 50, 14, 14);
		datiTecnici.add(label_1);
		
		textField_PrappHL = new JTextField();
		textField_PrappHL.setColumns(10);
		textField_PrappHL.setBounds(438, 47, 20, 20);
		datiTecnici.add(textField_PrappHL);
		
		textField_Pr = new JTextField();
		textField_Pr.setColumns(10);
		textField_Pr.setBounds(461, 47, 15, 20);
		datiTecnici.add(textField_Pr);
		
		textField_Pcerchio = new JTextField();
		textField_Pcerchio.setColumns(10);
		textField_Pcerchio.setBounds(479, 47, 20, 20);
		datiTecnici.add(textField_Pcerchio);
		
		textField_Pcarico = new JTextField();
		textField_Pcarico.setColumns(10);
		textField_Pcarico.setBounds(502, 47, 28, 20);
		datiTecnici.add(textField_Pcarico);
		
		textField_Pvelocita = new JTextField();
		textField_Pvelocita.setColumns(10);
		textField_Pvelocita.setBounds(533, 47, 20, 20);
		datiTecnici.add(textField_Pvelocita);
		
		JLabel lblNewLabel = new JLabel("<html><b>DATI MOTORE</b></html>");
		lblNewLabel.setBounds(20, 20, 92, 14);
		datiTecnici.add(lblNewLabel);
		
		JLabel lblcarico = new JLabel("<html><b>CARICO</b></html>");
		lblcarico.setBounds(20, 192, 78, 14);
		datiTecnici.add(lblcarico);
		
		JLabel lbldimensioni = new JLabel("<html><b>DIMENSIONI</b></html>");
		lbldimensioni.setBounds(20, 272, 78, 14);
		datiTecnici.add(lbldimensioni);
		
		JLabel lblprestazioni = new JLabel("<html><b>PRESTAZIONI</b></html>");
		lblprestazioni.setBounds(400, 100, 78, 14);
		datiTecnici.add(lblprestazioni);
		
		JLabel lblpneumatici = new JLabel("<html><b>PNEUMATICI</b></html>");
		lblpneumatici.setBounds(400, 20, 78, 14);
		datiTecnici.add(lblpneumatici);
		
		JButton btnCalcola = new JButton("<html><font size=\"5\"><b>Calcola</b></font></html>");
		btnCalcola.setBounds(844, 467, 150, 93);
		datiTecnici.add(btnCalcola);
		
		JLabel lblCarburante = new JLabel("Carburante");
		lblCarburante.setBounds(20, 132, 105, 17);
		datiTecnici.add(lblCarburante);
		
		final JRadioButton rdbtnBenzina = new JRadioButton("Benzina");
		buttonGroup.add(rdbtnBenzina);
		rdbtnBenzina.setBounds(154, 122, 109, 23);
		datiTecnici.add(rdbtnBenzina);
		
		final JRadioButton rdbtnDiesel = new JRadioButton("Diesel");
		buttonGroup.add(rdbtnDiesel);
		rdbtnDiesel.setBounds(154, 142, 109, 23);
		datiTecnici.add(rdbtnDiesel);
		
		JLabel lbltrasmissione = new JLabel("<html><b>TRASMISSIONE</b></html>");
		lbltrasmissione.setBounds(400, 255, 92, 14);
		datiTecnici.add(lbltrasmissione);
		
		JLabel lblRapportoAlPonte = new JLabel("<html>Rapporto al ponte (&omega<sub><small>IN</small></sub> / &omega<sub><small>OUT</small></sub>) [-]</html>");
		lblRapportoAlPonte.setBounds(400, 285, 182, 14);
		datiTecnici.add(lblRapportoAlPonte);
		
		textField_tauP = new JTextField();
		textField_tauP.setColumns(10);
		textField_tauP.setBounds(602, 282, 52, 20);
		datiTecnici.add(textField_tauP);
		
		JLabel lblnumeroDiRapporti = new JLabel("<html>Numero di rapporti al cambio [-]</html>");
		lblnumeroDiRapporti.setBounds(400, 310, 164, 14);
		datiTecnici.add(lblnumeroDiRapporti);
		
		textField_Nmarce = new JTextField();
		textField_Nmarce.setColumns(10);
		textField_Nmarce.setBounds(602, 307, 52, 20);
		datiTecnici.add(textField_Nmarce);
		
		JLabel lblrapportiAlCambio = new JLabel("<html>Rapporti al cambio  (&omega<sub><small>IN</small></sub> / &omega<sub><small>OUT</small></sub>) [-]</html>");
		lblrapportiAlCambio.setBounds(400, 335, 174, 14);
		datiTecnici.add(lblrapportiAlCambio);
		
		textField_tauI = new JTextField();
		textField_tauI.setColumns(10);
		textField_tauI.setBounds(602, 333, 35, 20);
		datiTecnici.add(textField_tauI);
		
		textField_tauII = new JTextField();
		textField_tauII.setColumns(10);
		textField_tauII.setBounds(642, 333, 35, 20);
		datiTecnici.add(textField_tauII);
		
		textField_tauIII = new JTextField();
		textField_tauIII.setColumns(10);
		textField_tauIII.setBounds(682, 333, 35, 20);
		datiTecnici.add(textField_tauIII);
		
		textField_tauIV = new JTextField();
		textField_tauIV.setColumns(10);
		textField_tauIV.setBounds(722, 333, 35, 20);
		datiTecnici.add(textField_tauIV);
		
		textField_tauV = new JTextField();
		textField_tauV.setColumns(10);
		textField_tauV.setBounds(762, 333, 35, 20);
		datiTecnici.add(textField_tauV);
		
		textField_tauVI = new JTextField();
		textField_tauVI.setColumns(10);
		textField_tauVI.setBounds(802, 333, 35, 20);
		datiTecnici.add(textField_tauVI);
		
		textField_tauVII = new JTextField();
		textField_tauVII.setColumns(10);
		textField_tauVII.setBounds(842, 333, 35, 20);
		datiTecnici.add(textField_tauVII);
		
		textField_tauVIII = new JTextField();
		textField_tauVIII.setColumns(10);
		textField_tauVIII.setBounds(882, 333, 35, 20);
		datiTecnici.add(textField_tauVIII);
		
		
		JLabel lblCoefficienteAerodinamicoCx = new JLabel("<html>Coefficiente aerodinamico C<sub>x</sub> stimato [-]</html>");
		lblCoefficienteAerodinamicoCx.setBounds(20, 50, 206, 14);
		carattCalc.add(lblCoefficienteAerodinamicoCx);
		
		textField_Cxout = new JTextField();
		textField_Cxout.setBounds(236, 47, 86, 20);
		carattCalc.add(textField_Cxout);
		textField_Cxout.setColumns(10);
		
		JLabel lblrendimentoA = new JLabel("<html>Rendimento a 100 Km/h &eta<sub>100</sub> stimato [-]</html>");
		lblrendimentoA.setBounds(20, 75, 206, 14);
		carattCalc.add(lblrendimentoA);
		
		textField_eta100out = new JTextField();
		textField_eta100out.setColumns(10);
		textField_eta100out.setBounds(236, 72, 86, 20);
		carattCalc.add(textField_eta100out);
		
		JLabel lblRaggioDiRotolamento = new JLabel("<html>Raggio di rotolamento [m]</html>");
		lblRaggioDiRotolamento.setBounds(20, 100, 206, 14);
		carattCalc.add(lblRaggioDiRotolamento);
		
		textField_Reff = new JTextField();
		textField_Reff.setColumns(10);
		textField_Reff.setBounds(236, 97, 86, 20);
		carattCalc.add(textField_Reff);
		
		JLabel lblResistenzaAllavanzamenton = new JLabel("<html>Resistenza all'avanzamento [N] (V [km/h])</html>");
		lblResistenzaAllavanzamenton.setBounds(20, 125, 206, 14);
		carattCalc.add(lblResistenzaAllavanzamenton);
		
		textField_Raout = new JTextField();
		textField_Raout.setColumns(10);
		textField_Raout.setBounds(236, 122, 37, 20);
		carattCalc.add(textField_Raout);
		
		final JLabel label_Vquadro = new JLabel("");
		label_Vquadro.setBounds(274, 123, 29, 14);
		carattCalc.add(label_Vquadro);
		
		JLabel lblMassaRidottakg = new JLabel("<html>Massa ridotta [kg] (&tau [-])</html>");
		lblMassaRidottakg.setBounds(20, 150, 206, 14);
		carattCalc.add(lblMassaRidottakg);
		
		textField_eqM2 = new JTextField();
		textField_eqM2.setColumns(10);
		textField_eqM2.setBounds(307, 147, 37, 20);
		carattCalc.add(textField_eqM2);
		
		final JLabel label_TAUquadro = new JLabel("");
		label_TAUquadro.setBounds(345, 148, 29, 14);
		carattCalc.add(label_TAUquadro);
		
		textField_eqM1 = new JTextField();
		textField_eqM1.setColumns(10);
		textField_eqM1.setBounds(236, 147, 57, 20);
		carattCalc.add(textField_eqM1);
		
		JLabel label_2 = new JLabel("+");
		label_2.setBounds(295, 148, 29, 14);
		carattCalc.add(label_2);

		JLabel lbl_ts = new JLabel("<html>Tempo di slittamento [s]</html>");
		lbl_ts.setBounds(20, 78, 115, 14);
		innesti.add(lbl_ts);
		
		JLabel lblCaloreSviluppato = new JLabel("<html>Calore sviluppato [J]</html>");
		lblCaloreSviluppato.setBounds(20, 103, 99, 14);
		innesti.add(lblCaloreSviluppato);
		
		textField = new JTextField();
		textField.setBounds(145, 75, 60, 20);
		innesti.add(textField);
		textField.setColumns(10);
		
		JLabel lblCambiMarcia = new JLabel("<html>Cambi marcia &nbsp &nbsp &nbsp &rarr</html>");
		lblCambiMarcia.setBounds(20, 50, 99, 14);
		innesti.add(lblCambiMarcia);
		
		JLabel lblararra_0 = new JLabel("<html> 1<sup>a</sup> &rarr 2<sup>a</sup></html>");
		lblararra_0.setBounds(224, 48, 39, 14);
		innesti.add(lblararra_0);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(145, 100, 60, 20);
		innesti.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(215, 75, 60, 20);
		innesti.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(215, 100, 60, 20);
		innesti.add(textField_3);
		
		JLabel lblararra_1 = new JLabel("<html> 2<sup>a</sup> &rarr 3<sup>a</sup></html>");
		lblararra_1.setBounds(294, 48, 39, 14);
		innesti.add(lblararra_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(285, 75, 60, 20);
		innesti.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(285, 100, 60, 20);
		innesti.add(textField_5);
		
		JLabel lblararra_2 = new JLabel("<html> 3<sup>a</sup> &rarr 4<sup>a</sup></html>");
		lblararra_2.setBounds(364, 48, 39, 14);
		innesti.add(lblararra_2);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(355, 75, 60, 20);
		innesti.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(355, 100, 60, 20);
		innesti.add(textField_7);
		
		JLabel lblararra_3 = new JLabel("<html> 4<sup>a</sup> &rarr 5<sup>a</sup></html>");
		lblararra_3.setBounds(434, 48, 39, 14);
		innesti.add(lblararra_3);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(425, 75, 60, 20);
		innesti.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(425, 100, 60, 20);
		innesti.add(textField_9);
		
		JLabel lblararra_4 = new JLabel("<html> 5<sup>a</sup> &rarr 6<sup>a</sup></html>");
		lblararra_4.setBounds(504, 48, 39, 14);
		innesti.add(lblararra_4);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(495, 75, 60, 20);
		innesti.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(495, 100, 60, 20);
		innesti.add(textField_11);
		
		JLabel lblararra_5 = new JLabel("<html> 6<sup>a</sup> &rarr 7<sup>a</sup></html>");
		lblararra_5.setBounds(574, 48, 39, 14);
		innesti.add(lblararra_5);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(565, 75, 60, 20);
		innesti.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(565, 100, 60, 20);
		innesti.add(textField_13);
		
		JLabel lblararra_6 = new JLabel("<html> 7<sup>a</sup> &rarr 8<sup>a</sup></html>");
		lblararra_6.setBounds(644, 48, 39, 14);
		innesti.add(lblararra_6);
		
		JLabel lblararra_00 = new JLabel("<html> 0 &rarr 1<sup>a</sup></html>");
		lblararra_00.setBounds(157, 48, 34, 14);
		innesti.add(lblararra_00);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(635, 75, 60, 20);
		innesti.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(635, 100, 60, 20);
		innesti.add(textField_15);
		
		JLabel lbltransitoriDinnesto = new JLabel("<html><b>TRANSITORI D'INNESTO</b></html>");
		lbltransitoriDinnesto.setBounds(20, 20, 131, 14);
		innesti.add(lbltransitoriDinnesto);
		
		JLabel lblcaratteristicheGeometricheDel = new JLabel("<html><b>CARATTERISTICHE GEOMETRICHE DEL SINGOLO DISCO</b></html>");
		lblcaratteristicheGeometricheDel.setBounds(20, 153, 299, 14);
		innesti.add(lblcaratteristicheGeometricheDel);
		
		textField_superficie = new JTextField();
		textField_superficie.setColumns(10);
		textField_superficie.setBounds(130, 190, 52, 20);
		innesti.add(textField_superficie);
		
		JLabel lblraggioInternocm = new JLabel("<html>Raggio interno [cm]</html>");
		lblraggioInternocm.setBounds(20, 218, 108, 14);
		innesti.add(lblraggioInternocm);
		
		textField_raggioInt = new JTextField();
		textField_raggioInt.setColumns(10);
		textField_raggioInt.setBounds(130, 215, 52, 20);
		innesti.add(textField_raggioInt);
		
		JLabel lblraggioEsternocm = new JLabel("<html>Raggio esterno [cm]</html>");
		lblraggioEsternocm.setBounds(20, 243, 99, 14);
		innesti.add(lblraggioEsternocm);
		
		textField_raggioEst = new JTextField();
		textField_raggioEst.setColumns(10);
		textField_raggioEst.setBounds(130, 240, 52, 20);
		innesti.add(textField_raggioEst);
		
		JLabel lblverifiche = new JLabel("<html><b>VERIFICHE</b></html>");
		lblverifiche.setBounds(20, 318, 60, 14);
		innesti.add(lblverifiche);
		
		JLabel lblNewLabel_1 = new JLabel("<html>Verifica strutturale</html>");
		lblNewLabel_1.setBounds(20, 348, 89, 14);
		innesti.add(lblNewLabel_1);
		
		JLabel lblVerificaTermica = new JLabel("<html>Verifica termica</html>");
		lblVerificaTermica.setBounds(20, 373, 89, 14);
		innesti.add(lblVerificaTermica);
		
		JLabel lblManovreRipetute = new JLabel("<html>Manovre ripetute</html>");
		lblManovreRipetute.setBounds(20, 398, 89, 14);
		innesti.add(lblManovreRipetute);
		
		JLabel lblSlittamentoContinuo = new JLabel("<html>Slittamento continuo</html>");
		lblSlittamentoContinuo.setBounds(20, 423, 99, 14);
		innesti.add(lblSlittamentoContinuo);
		
		final JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.setBounds(130, 344, 21, 23);
		innesti.add(checkBox_1);
		
		final JCheckBox checkBox_2 = new JCheckBox("");
		checkBox_2.setBounds(130, 369, 21, 23);
		innesti.add(checkBox_2);
		
		final JCheckBox checkBox_3 = new JCheckBox("");
		checkBox_3.setBounds(130, 394, 21, 23);
		innesti.add(checkBox_3);
		
		final JCheckBox checkBox_4 = new JCheckBox("");
		checkBox_4.setBounds(130, 419, 21, 23);
		innesti.add(checkBox_4);
		
		final JLabel lblrarr = new JLabel("<html>&rarr</html>");
		lblrarr.setBounds(157, 423, 11, 14);
		innesti.add(lblrarr);
		
		final JLabel lblraggioInternoModificato = new JLabel("<html>Raggio interno modificato [cm]</html>");
		lblraggioInternoModificato.setBounds(178, 423, 146, 14);
		innesti.add(lblraggioInternoModificato);
		
		textField_raggioIntNew = new JTextField();
		textField_raggioIntNew.setColumns(10);
		textField_raggioIntNew.setBounds(336, 420, 52, 20);
		innesti.add(textField_raggioIntNew);
		
		final JLabel lblraggioEsternoModificato = new JLabel("<html>Raggio esterno modificato [cm]</html>");
		lblraggioEsternoModificato.setBounds(178, 449, 155, 14);
		innesti.add(lblraggioEsternoModificato);
		
		textField_raggioEstNew = new JTextField();
		textField_raggioEstNew.setColumns(10);
		textField_raggioEstNew.setBounds(336, 446, 52, 20);
		innesti.add(textField_raggioEstNew);
		
		JLabel lblsuperficiecm = new JLabel("<html>Superficie [cm<sup>2</sup>]</html>");
		lblsuperficiecm.setBounds(20, 190, 108, 17);
		innesti.add(lblsuperficiecm);
		
		JLabel lblspessoremm = new JLabel("<html>Spessore [mm]</html>");
		lblspessoremm.setBounds(20, 268, 99, 14);
		innesti.add(lblspessoremm);
		
		textField_spessore = new JTextField();
		textField_spessore.setColumns(10);
		textField_spessore.setBounds(130, 265, 52, 20);
		innesti.add(textField_spessore);
		
		JLabel lblTipoFrizione = new JLabel("Tipo frizione");
		lblTipoFrizione.setBounds(400, 368, 105, 17);
		datiTecnici.add(lblTipoFrizione);
		
		final JRadioButton rdbtnMonodisco = new JRadioButton("Monodisco");
		buttonGroup_1.add(rdbtnMonodisco);
		rdbtnMonodisco.setBounds(602, 358, 109, 23);
		datiTecnici.add(rdbtnMonodisco);
		
		final JRadioButton rdbtnPluridisco = new JRadioButton("Pluridisco");
		buttonGroup_1.add(rdbtnPluridisco);
		rdbtnPluridisco.setBounds(602, 378, 109, 23);
		datiTecnici.add(rdbtnPluridisco);
		
		final JButton btnvisualizzaGrafici = new JButton("<html><font size=\"5\"><center><b>Visualizza<br>grafici</b></center></font></html>");
		btnvisualizzaGrafici.setBounds(682, 487, 150, 53);
		datiTecnici.add(btnvisualizzaGrafici);
		
		final JRadioButton rdbtnAnteriore = new JRadioButton("Anteriore");
		buttonGroup_2.add(rdbtnAnteriore);
		rdbtnAnteriore.setBounds(602, 403, 109, 23);
		datiTecnici.add(rdbtnAnteriore);
		
		final JRadioButton rdbtnPosteriore = new JRadioButton("Posteriore");
		buttonGroup_2.add(rdbtnPosteriore);
		rdbtnPosteriore.setBounds(602, 423, 109, 23);
		datiTecnici.add(rdbtnPosteriore);
		
		final JRadioButton rdbtnIntegrale = new JRadioButton("Integrale");
		buttonGroup_2.add(rdbtnIntegrale);
		rdbtnIntegrale.setBounds(602, 443, 109, 23);
		datiTecnici.add(rdbtnIntegrale);
		
		JLabel lblTrazione = new JLabel("Trazione");
		lblTrazione.setBounds(400, 427, 105, 17);
		datiTecnici.add(lblTrazione);
		
		JLabel lblrapportoInUltima = new JLabel("<html><b>RAPPORTO IN ULTIMA MARCIA</b></html>");
		lblrapportoInUltima.setBounds(20, 20, 172, 14);
		cambio.add(lblrapportoInUltima);
		
		JLabel lblmassimaVelocitIn = new JLabel("<html>Massima velocit\u00E0 in piano</html>");
		lblmassimaVelocitIn.setBounds(20, 50, 120, 14);
		cambio.add(lblmassimaVelocitIn);
		
		JLabel lblrapportoInPrima = new JLabel("<html><b>RAPPORTO IN PRIMA MARCIA </b></html>");
		lblrapportoInPrima.setBounds(20, 100, 172, 14);
		cambio.add(lblrapportoInPrima);
		
		JLabel lblmassimaPendenzaSuperabile = new JLabel("<html>Massima pendenza superabile</html>");
		lblmassimaPendenzaSuperabile.setBounds(20, 130, 142, 14);
		cambio.add(lblmassimaPendenzaSuperabile);
		
		JLabel lblmassimaAderenzaIn = new JLabel("<html>Massima aderenza in piano</html>");
		lblmassimaAderenzaIn.setBounds(20, 155, 142, 14);
		cambio.add(lblmassimaAderenzaIn);
		
		JLabel lblverificaAPasso = new JLabel("<html>Verifica a passo d'uomo</html>");
		lblverificaAPasso.setBounds(20, 180, 142, 14);
		cambio.add(lblverificaAPasso);
		
		textField_tauMinAlpha = new JTextField();
		textField_tauMinAlpha.setBounds(172, 127, 86, 20);
		cambio.add(textField_tauMinAlpha);
		textField_tauMinAlpha.setColumns(10);
		
		textField_tauMaxAderenza = new JTextField();
		textField_tauMaxAderenza.setColumns(10);
		textField_tauMaxAderenza.setBounds(172, 152, 86, 20);
		cambio.add(textField_tauMaxAderenza);
		
		textField_tauMinPassoUomo = new JTextField();
		textField_tauMinPassoUomo.setColumns(10);
		textField_tauMinPassoUomo.setBounds(172, 177, 86, 20);
		cambio.add(textField_tauMinPassoUomo);
		
		textField_tauMax = new JTextField();
		textField_tauMax.setColumns(10);
		textField_tauMax.setBounds(172, 47, 86, 20);
		cambio.add(textField_tauMax);

		JLabel lblrapportoIntermedi = new JLabel("<html><b>RAPPORTI INTERMEDI</b></html>");
		lblrapportoIntermedi.setBounds(20, 230, 123, 14);
		cambio.add(lblrapportoIntermedi);
		
		JLabel lblprogressioneGeometrica = new JLabel("<html>Progressione geometrica</html>");
		lblprogressioneGeometrica.setBounds(20, 260, 142, 14);
		cambio.add(lblprogressioneGeometrica);
		
		JLabel lblrapportiRavvicinati = new JLabel("<html>Rapporti ravvicinati</html>");
		lblrapportiRavvicinati.setBounds(20, 285, 142, 14);
		cambio.add(lblrapportiRavvicinati);
		
		textField_100 = new JTextField();
		textField_100.setColumns(10);
		textField_100.setBounds(172, 257, 35, 20);
		cambio.add(textField_100);
		
		textField_101 = new JTextField();
		textField_101.setColumns(10);
		textField_101.setBounds(212, 257, 35, 20);
		cambio.add(textField_101);
		
		textField_102 = new JTextField();
		textField_102.setColumns(10);
		textField_102.setBounds(252, 257, 35, 20);
		cambio.add(textField_102);
		
		textField_103 = new JTextField();
		textField_103.setColumns(10);
		textField_103.setBounds(292, 257, 35, 20);
		cambio.add(textField_103);
		
		textField_104 = new JTextField();
		textField_104.setColumns(10);
		textField_104.setBounds(332, 257, 35, 20);
		cambio.add(textField_104);
		
		textField_105 = new JTextField();
		textField_105.setColumns(10);
		textField_105.setBounds(372, 257, 35, 20);
		cambio.add(textField_105);
		
		textField_106 = new JTextField();
		textField_106.setColumns(10);
		textField_106.setBounds(412, 257, 35, 20);
		cambio.add(textField_106);
		
		textField_107 = new JTextField();
		textField_107.setColumns(10);
		textField_107.setBounds(452, 257, 35, 20);
		cambio.add(textField_107);
		
		textField_200 = new JTextField();
		textField_200.setColumns(10);
		textField_200.setBounds(172, 282, 35, 20);
		cambio.add(textField_200);
		
		textField_201 = new JTextField();
		textField_201.setColumns(10);
		textField_201.setBounds(212, 282, 35, 20);
		cambio.add(textField_201);
		
		textField_202 = new JTextField();
		textField_202.setColumns(10);
		textField_202.setBounds(252, 282, 35, 20);
		cambio.add(textField_202);
		
		textField_203 = new JTextField();
		textField_203.setColumns(10);
		textField_203.setBounds(292, 282, 35, 20);
		cambio.add(textField_203);
		
		textField_204 = new JTextField();
		textField_204.setColumns(10);
		textField_204.setBounds(332, 282, 35, 20);
		cambio.add(textField_204);
		
		textField_205 = new JTextField();
		textField_205.setColumns(10);
		textField_205.setBounds(372, 282, 35, 20);
		cambio.add(textField_205);
		
		textField_206 = new JTextField();
		textField_206.setColumns(10);
		textField_206.setBounds(412, 282, 35, 20);
		cambio.add(textField_206);
		
		textField_207 = new JTextField();
		textField_207.setColumns(10);
		textField_207.setBounds(452, 282, 35, 20);
		cambio.add(textField_207);
		
		JLabel lblprovaTipo = new JLabel("<html><b>PROVA TIPO \"0\"</b></html>");
		lblprovaTipo.setBounds(20, 20, 92, 14);
		freni.add(lblprovaTipo);
		
		JLabel lblcoppiaFrenanteSingolo = new JLabel("<html>Coppia frenante singolo disco anteriore [Nm]</html>");
		lblcoppiaFrenanteSingolo.setBounds(20, 50, 214, 17);
		freni.add(lblcoppiaFrenanteSingolo);
		
		textField_Ca0 = new JTextField();
		textField_Ca0.setColumns(10);
		textField_Ca0.setBounds(250, 47, 52, 20);
		freni.add(textField_Ca0);
		
		JLabel lblcoppiaFrenanteSingolo_1 = new JLabel("<html>Coppia frenante singolo disco posteriore [Nm]</html>");
		lblcoppiaFrenanteSingolo_1.setBounds(20, 75, 224, 14);
		freni.add(lblcoppiaFrenanteSingolo_1);
		
		textField_Cp0 = new JTextField();
		textField_Cp0.setColumns(10);
		textField_Cp0.setBounds(250, 72, 52, 20);
		freni.add(textField_Cp0);
		
		JLabel lblprovaTipo_1 = new JLabel("<html><b>PROVA TIPO \"1\"</b></html>");
		lblprovaTipo_1.setBounds(20, 125, 92, 14);
		freni.add(lblprovaTipo_1);
		
		JLabel label_5 = new JLabel("<html>Coppia frenante singolo disco anteriore [Nm]</html>");
		label_5.setBounds(20, 155, 214, 17);
		freni.add(label_5);
		
		textField_Ca1 = new JTextField();
		textField_Ca1.setColumns(10);
		textField_Ca1.setBounds(250, 152, 52, 20);
		freni.add(textField_Ca1);
		
		textField_Cp1 = new JTextField();
		textField_Cp1.setColumns(10);
		textField_Cp1.setBounds(250, 182, 52, 20);
		freni.add(textField_Cp1);
		
		JLabel label_6 = new JLabel("<html>Coppia frenante singolo disco posteriore [Nm]</html>");
		label_6.setBounds(20, 185, 224, 14);
		freni.add(label_6);
		
		JLabel lblsuperficieFrenante = new JLabel("<html><b>SUPERFICIE FRENANTE ANTERIORE</b></html>");
		lblsuperficieFrenante.setBounds(400, 20, 189, 14);
		freni.add(lblsuperficieFrenante);
		
		JLabel lblraggioEsternoDisco = new JLabel("<html>Raggio esterno singolo disco anteriore [mm]</html>");
		lblraggioEsternoDisco.setBounds(400, 50, 214, 17);
		freni.add(lblraggioEsternoDisco);
		
		textField_rea = new JTextField();
		textField_rea.setColumns(10);
		textField_rea.setBounds(630, 47, 52, 20);
		freni.add(textField_rea);
		
		textField_ria = new JTextField();
		textField_ria.setColumns(10);
		textField_ria.setBounds(630, 72, 52, 20);
		freni.add(textField_ria);
		
		JLabel lblraggioInternoDisco = new JLabel("<html>Raggio interno singolo disco anteriore [mm]</html>");
		lblraggioInternoDisco.setBounds(400, 75, 214, 17);
		freni.add(lblraggioInternoDisco);
		
		JLabel lblraggioEsternoDisco_1 = new JLabel("<html>Area superficie frenante anteriore [mm<sup>2</sup>]</html>");
		lblraggioEsternoDisco_1.setBounds(400, 100, 196, 17);
		freni.add(lblraggioEsternoDisco_1);
		
		textField_areaA = new JTextField();
		textField_areaA.setColumns(10);
		textField_areaA.setBounds(630, 97, 52, 20);
		freni.add(textField_areaA);
		
		JLabel lblraggioInternoDisco_1 = new JLabel("<html>Raggio interno singolo disco posteriore [mm]</html>");
		lblraggioInternoDisco_1.setBounds(400, 228, 214, 17);
		freni.add(lblraggioInternoDisco_1);
		
		textField_rip = new JTextField();
		textField_rip.setColumns(10);
		textField_rip.setBounds(630, 225, 52, 20);
		freni.add(textField_rip);
		
		JLabel lblraggioEsternoSingolo = new JLabel("<html>Raggio esterno singolo disco posteriore [mm]</html>");
		lblraggioEsternoSingolo.setBounds(400, 205, 220, 17);
		freni.add(lblraggioEsternoSingolo);
		
		textField_rep = new JTextField();
		textField_rep.setColumns(10);
		textField_rep.setBounds(630, 202, 52, 20);
		freni.add(textField_rep);
		
		JLabel lblareaSuperficieFrenante = new JLabel("<html>Area superficie frenante posteriore [mm<sup>2</sup>]</html>");
		lblareaSuperficieFrenante.setBounds(400, 253, 201, 17);
		freni.add(lblareaSuperficieFrenante);
		
		textField_areaP = new JTextField();
		textField_areaP.setColumns(10);
		textField_areaP.setBounds(630, 250, 52, 20);
		freni.add(textField_areaP);
		
		JLabel lblspessoreSuperficieAnteriore = new JLabel("<html>Spessore superficie frenante anteriore [mm]</html>");
		lblspessoreSuperficieAnteriore.setBounds(400, 125, 214, 17);
		freni.add(lblspessoreSuperficieAnteriore);
		
		JLabel lblspessoreSuperficiePosteriore = new JLabel("<html>Spessore superficie frenante posteriore [mm]</html>");
		lblspessoreSuperficiePosteriore.setBounds(400, 278, 220, 17);
		freni.add(lblspessoreSuperficiePosteriore);
		
		textField_sP = new JTextField();
		textField_sP.setColumns(10);
		textField_sP.setBounds(630, 275, 52, 20);
		freni.add(textField_sP);
		
		textField_sA = new JTextField();
		textField_sA.setColumns(10);
		textField_sA.setBounds(630, 122, 52, 20);
		freni.add(textField_sA);
		
		JLabel lblsuperficieFrenantePosteriore = new JLabel("<html><b>SUPERFICIE FRENANTE POSTERIORE</b></html>");
		lblsuperficieFrenantePosteriore.setBounds(400, 175, 224, 14);
		freni.add(lblsuperficieFrenantePosteriore);
		
		JLabel lblparametri = new JLabel("<html><b>PARAMETRI STATICI, CINEMATICI, DINAMICI ED ENERGETICI</b></html>");
		lblparametri.setBounds(20, 20, 335, 14);
		carattCalc.add(lblparametri);
		
		JLabel lblprestazioni_1 = new JLabel("<html><b>PRESTAZIONI</b></html>");
		lblprestazioni_1.setBounds(20, 200, 75, 14);
		carattCalc.add(lblprestazioni_1);
		
		JLabel lblaccelerazioneKmh = new JLabel("<html>Accelerazione 0-100 km/h [s]</html>");
		lblaccelerazioneKmh.setBounds(20, 230, 206, 14);
		carattCalc.add(lblaccelerazioneKmh);
		
		JLabel lblripresaKmh = new JLabel("<html>Ripresa 80-120 km/h in ultima marcia [s]</html>");
		lblripresaKmh.setBounds(20, 255, 206, 14);
		carattCalc.add(lblripresaKmh);
		
		JLabel lblMDa = new JLabel("<html>400 m da fermo [s]</html>");
		lblMDa.setBounds(20, 280, 206, 14);
		carattCalc.add(lblMDa);
		
		JLabel lblMDa_1 = new JLabel("<html>1000 m da fermo [s]</html>");
		lblMDa_1.setBounds(20, 305, 206, 14);
		carattCalc.add(lblMDa_1);
		
		textField_0100 = new JTextField();
		textField_0100.setColumns(10);
		textField_0100.setBounds(236, 227, 40, 20);
		carattCalc.add(textField_0100);
		
		textField_80120 = new JTextField();
		textField_80120.setColumns(10);
		textField_80120.setBounds(236, 252, 40, 20);
		carattCalc.add(textField_80120);
		
		textField_400 = new JTextField();
		textField_400.setColumns(10);
		textField_400.setBounds(236, 277, 40, 20);
		carattCalc.add(textField_400);
		
		textField_1000 = new JTextField();
		textField_1000.setColumns(10);
		textField_1000.setBounds(236, 302, 40, 20);
		carattCalc.add(textField_1000);
		
		JLabel lblvelocitDiUscita = new JLabel("<html>Velocit\u00E0 di uscita [km/h]</html>");
		lblvelocitDiUscita.setBounds(286, 280, 113, 14);
		carattCalc.add(lblvelocitDiUscita);
		
		JLabel label_3 = new JLabel("<html>Velocit\u00E0 di uscita [km/h]</html>");
		label_3.setBounds(286, 305, 113, 14);
		carattCalc.add(label_3);
		
		textField_400v = new JTextField();
		textField_400v.setColumns(10);
		textField_400v.setBounds(409, 277, 40, 20);
		carattCalc.add(textField_400v);
		
		textField_1000v = new JTextField();
		textField_1000v.setColumns(10);
		textField_1000v.setBounds(409, 302, 40, 20);
		carattCalc.add(textField_1000v);
		
		JMenuBar menuBar = new JMenuBar();
		frmSoftwareDiCalcolo.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenu mnCaricaModello = new JMenu("Carica modello");
		mnFile.add(mnCaricaModello);
		
		JMenu mnAlfaRomeo = new JMenu("Alfa Romeo");
		mnCaricaModello.add(mnAlfaRomeo);
		
		JMenuItem mntmMitoTurbo = new JMenuItem("MiTo 1.4 Turbo");
		mnAlfaRomeo.add(mntmMitoTurbo);
		
		JMenu mnAudi = new JMenu("Audi");
		mnCaricaModello.add(mnAudi);
		
		JMenuItem mntmS = new JMenuItem("S3 Limousine");
		mnAudi.add(mntmS);
		
		JMenuItem mntmRs = new JMenuItem("RS7");
		mnAudi.add(mntmRs);
		
		JMenuItem mntmTt = new JMenuItem("TT RS");
		mnAudi.add(mntmTt);
		
		JMenuItem mntmEsci = new JMenuItem("Esci");
		mnFile.add(mntmEsci);
		
		// END COMPONENTS ----------------------------------------------------------------------------------------------------------------------
		
		final JTextField gearRatios[] = new JTextField[]{
				textField_tauI,
				textField_tauII,
				textField_tauIII,
				textField_tauIV,
				textField_tauV,
				textField_tauVI,
				textField_tauVII,
				textField_tauVIII
		};
		
		final JTextField slidingTimeHeat[] = new JTextField[]{
				textField,
				textField_1,
				textField_2,
				textField_3,
				textField_4,
				textField_5,
				textField_6,
				textField_7,
				textField_8,
				textField_9,
				textField_10,
				textField_11,
				textField_12,
				textField_13,
				textField_14,
				textField_15
		};
		
		final JLabel gearShifts[] = new JLabel[]{
				lblararra_00,
				lblararra_0,
				lblararra_1,
				lblararra_2,
				lblararra_3,
				lblararra_4,
				lblararra_5,
				lblararra_6
		};
		
		final JTextField gearRatiosGeom[] = new JTextField[]{
				textField_100,
				textField_101,
				textField_102,
				textField_103,
				textField_104,
				textField_105,
				textField_106,
				textField_107
		};
		
		final JTextField gearRatiosClose[] = new JTextField[]{
				textField_200,
				textField_201,
				textField_202,
				textField_203,
				textField_204,
				textField_205,
				textField_206,
				textField_207
		};
		
		for (int i = 0; i < gearRatios.length; i++){
			gearRatios[i].setVisible(false);
		}		
		for (int i = 0; i < slidingTimeHeat.length; i++){
			slidingTimeHeat[i].setVisible(false);
		}		
		for (int i = 0; i < gearShifts.length; i++){
			gearShifts[i].setVisible(false);
		}
		for (int i = 0; i < gearRatiosGeom.length; i++){
			gearRatiosGeom[i].setVisible(false);
		}
		for (int i = 0; i < gearRatiosClose.length; i++){
			gearRatiosClose[i].setVisible(false);
		}
		
		lblrarr.setVisible(false);
		lblraggioInternoModificato.setVisible(false);
		lblraggioEsternoModificato.setVisible(false);
		textField_raggioIntNew.setVisible(false);
		textField_raggioEstNew.setVisible(false);
		
		btnvisualizzaGrafici.setVisible(false);

		// disable all the output panels at the beginning --------------------------------------------------------------------------------------
		enableComponents(carattCalc,false);
		enableComponents(innesti,false);
		enableComponents(cambio,false);
		enableComponents(freni,false);
		
		// FUNCTIONS ---------------------------------------------------------------------------------------------------------------------------
		
		// enable text fields for the gear ratios ----------------------------------------------------------------------------------------------
		textField_Nmarce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				for (int i = 0; i < gearRatios.length; i++){
					gearRatios[i].setVisible(false);
				}				
				for (int i = 0; i < slidingTimeHeat.length; i++){
					slidingTimeHeat[i].setVisible(false);
				}				
				for (int i = 0; i < gearShifts.length; i++){
					gearShifts[i].setVisible(false);
				}
				for (int i = 0; i < gearRatiosGeom.length; i++){
					gearRatiosGeom[i].setVisible(false);
				}
				for (int i = 0; i < gearRatiosClose.length; i++){
					gearRatiosClose[i].setVisible(false);
				}

				double nD = Double.parseDouble(textField_Nmarce.getText()); // just to try the parseDouble ...
				int nI = (int)nD; // ... and the conversion

				if (nI>8)
					nI = 8;

				for (int i = 0; i < nI; i++){
					gearRatios[i].setVisible(true);
				}
				for (int i = 0; i < 2*nI; i++){
					slidingTimeHeat[i].setVisible(true);
				}
				for (int i = 0; i < nI; i++){
					gearShifts[i].setVisible(true);
				}
				for (int i = 0; i < nI; i++){
					gearRatiosGeom[i].setVisible(true);
				}
				for (int i = 0; i < nI; i++){
					gearRatiosClose[i].setVisible(true);
				}
			}
		});
		
		// enable all the output panels when the "calculate" button is pressed -----------------------------------------------------------------
		btnCalcola.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				// enable components on the other tabs
				enableComponents(carattCalc,true);		
				enableComponents(innesti,true);
				enableComponents(cambio,true);
				enableComponents(freni,true);
				
				// evaluation of Cx
				double K = 1;
				if (textField_Pr.getText().equals("R")){
					K = 0.8;
				}
				double Q = Double.parseDouble(textField_massa.getText());
				double Rr = K*Q/1000*(5.1 + (5.5+(18*Q/1000))/2.2 + (8.5+(6*Q/1000))/2.2)*9.81;			
				double alt = Double.parseDouble(textField_altezza.getText());
				double larg = Double.parseDouble(textField_larghezza.getText());
				double S = 0.8*alt/1000*larg/1000;
				double N100 = Double.parseDouble(textField_N100.getText());
				double Cxout = (N100*1000 - Rr*100/3.6)/(0.5*1.225*S*Math.pow(100/3.6,3));
				textField_Cxout.setText(String.format("%.3f",Cxout));
				
				// evaluation of eta100
				double Cpi = 0, gammaC = 0;
				double Cs = Double.parseDouble(textField_consumo.getText());
				if (rdbtnBenzina.isSelected()){
					Cpi = 10500;
					gammaC = 0.74;
				}
				else if (rdbtnDiesel.isSelected()){
					Cpi = 10600;
					gammaC = 0.87;
				}
				double potenza100 = 1000 * 4.19 * Cpi * gammaC * Cs * 100 / 3600;
				double eta100 = N100*1000 / potenza100;
				textField_eta100out.setText(String.format("%.3f",eta100));
				
				// calculation of power and torque curves coefficients and plot the curves with Matlab(r) <--- AHAHAH!!!
				double rads2rpm = 60/(2*Math.PI);
				double nPmax = Double.parseDouble(textField_rpmPotMax.getText());
				double nCmax = Double.parseDouble(textField_rpmCoppiaMax.getText());
				double Pmax = Double.parseDouble(textField_potMax.getText());
				double Cmax = Double.parseDouble(textField_coppiaMax.getText());
				double[][] Aarray = { { Math.pow(nPmax,3), Math.pow(nPmax,2), nPmax }, { 3*Math.pow(nPmax,2), 2*nPmax, 1 }, { rads2rpm*Math.pow(nCmax,2), rads2rpm*nCmax, rads2rpm }, { 2*nCmax, 1, 0 } };
				Matrix Amatrix = new Matrix(Aarray,4,3);
				double[][] Barray = { {1000*Pmax} , {0}, {Cmax}, {0} };
				Matrix Bmatrix = new Matrix(Barray,4,1);
				Matrix Xmatrix = Amatrix.inverse().times(Bmatrix);
				aString = Double.toString(Xmatrix.get(0,0)); // a
				bString = Double.toString(Xmatrix.get(1,0)); // b
				cString = Double.toString(Xmatrix.get(2,0)); // c
				
				// evaluation of the tire rolling radius
				double Rcerchio = Double.parseDouble(textField_Pcerchio.getText()) / 2 * 25.4;
				double deltaR = Double.parseDouble(textField_PrappHL.getText()) / 100 * Double.parseDouble(textField_Plarg.getText());
				double Rg = (Rcerchio + deltaR) / 10; // [cm]
				double Qa = Q * (1 - Double.parseDouble(textField_semipassoAnt.getText())/Double.parseDouble(textField_passo.getText())) / 2;
				double Reff = Rg - Math.pow(Qa/(0.31*2.2*Math.pow(2*Rg, 1.5)),2);
				textField_Reff.setText(String.format("%.3f",Reff/100));
				
				// calculation of the aerodynamic resistance
				double aeroCoeff = 0.5 * 1.225 * Double.parseDouble(textField_Cx.getText()) * S / Math.pow(3.6, 2);
				textField_Raout.setText(String.format("%.3f",aeroCoeff));
				label_Vquadro.setText("<html>&middot V<sup>2</sup></html>");
				
				// calculation of the equivalent mass
				double massaEq1 = Q * 1.04;
				double massaEq2 = Q * 0.0025;
				textField_eqM1.setText(String.format("%.3f",massaEq1));
				textField_eqM2.setText(String.format("%.3f",massaEq2));
				label_TAUquadro.setText("<html>&middot &tau<sup>2</sup></html>");
				
				// calculation of sliding time and generated heat
				double M0 = 1.15*Cmax;
				double Jm = 0.0025*Math.pow(Reff/100,2)*Q;
				int nI = Integer.parseInt(textField_Nmarce.getText());
				double tau_p = Double.parseDouble(textField_tauP.getText());
				double t_i = 0.3;
				double tauGC = 0;
				double etaGC = 0;
				double omega0 = 0;
				double t_sGC = 0;
				double QcaloreGC = 0;
				for (int i = 0; i < nI; i++){
					double tau_i = Double.parseDouble(gearRatios[i].getText());
					double etaM = 1 - (nPmax/1000 + 4 + Math.sqrt(2*tau_p - 1) + Math.sqrt(2*tau_i - 1))/100;
					double Jv = 1.04*Math.pow(Reff/100,2)*Q/(Math.pow(tau_p,2)*Math.pow(tau_i,2)*etaM);
					double Mm = (Xmatrix.get(0,0)*Math.pow(2000,2) + Xmatrix.get(1,0)*2000 + Xmatrix.get(2,0)) * 60 / (2*Math.PI);
					double omega_m0 = 2*Math.PI*2000/60;
					double omega_v0 = 0;
					if (i>0){
						omega_m0 = 2*Math.PI*nPmax/60;
						omega_v0 = omega_m0 / Double.parseDouble(gearRatios[i-1].getText()) * tau_i;
						Mm = (Xmatrix.get(0,0)*Math.pow(nPmax,2) + Xmatrix.get(1,0)*nPmax + Xmatrix.get(2,0)) * 60 / (2*Math.PI);
					}					
					double Ra = 0.5 * 1.225 * Double.parseDouble(textField_Cx.getText()) * S * Math.pow(omega_v0*Reff/100/(tau_p*tau_i) ,2);
					double Rr_v = K*Q/1000*(5.1 + (5.5+(18*Q/1000))/2.2 + (8.5+(6*Q/1000))/2.2*Math.pow((omega_v0*Reff/100/(tau_p*tau_i)*3.6)/100, 2))*9.81;
					double Mr = (Ra + Rr_v)*Reff/100 / tau_p / tau_i / etaM;
					double I = 1/Jm + 1/Jv;
					double M = Mm/Jm + Mr/Jv;
					double t_s = 0;
					double Qcalore = 0;
					if (rdbtnMonodisco.isSelected()){
						t_s = (2*(omega_m0 - omega_v0) + I*M0*t_i)/(2*(I*M0 - M));
						double tI1 = t_i/Math.sqrt(3)+t_i/2;
						double tI2 = -t_i/Math.sqrt(3)+t_i/2;
						double tII = (t_s+t_i)/2;
						double wI1 = 1;
						double wI2 = 1;
						double wII = 2;
						double f_tI1 = (M0*tI1/t_i) * ((omega_m0 - omega_v0) + M*tI1 - I*M0/2*Math.pow(tI1, 2)/t_i);
						double f_tI2 = (M0*tI2/t_i) * ((omega_m0 - omega_v0) + M*tI2 - I*M0/2*Math.pow(tI2, 2)/t_i);
						double f_tII = M0 * ((omega_m0 - omega_v0) + M*tII - I*M0/2*(2*tII - t_i));
						Qcalore = t_i/2 * (wI1*f_tI1 + wI2*f_tI2) + (t_s-t_i)/2 * wII*f_tII;
						slidingTimeHeat[2*i].setText(String.format("%.3f",t_s));
						slidingTimeHeat[2*i+1].setText(String.format("%.3f",Qcalore));
					}
					else if (rdbtnPluridisco.isSelected()){
						t_s = (3*(omega_m0 - omega_v0) + I*M0*t_i)/(3*(I*M0 - M));
						double tI1 = t_i*Math.sqrt(3/5)+t_i/2;
						double tI2 = -t_i*0+t_i/2;
						double tI3 = -t_i*Math.sqrt(3/5)+t_i/2;
						double tII = (t_s+t_i)/2;
						double wI1 = 5/9;
						double wI2 = 8/9;
						double wI3 = 5/9;
						double wII = 2;
						double f_tI1 = (M0*tI1/t_i*(2-tI1/t_i)) * ((omega_m0 - omega_v0) + M*tI1 - I*M0*(1-tI1/3/t_i)*Math.pow(tI1, 2)/3/t_i);
						double f_tI2 = (M0*tI2/t_i*(2-tI2/t_i)) * ((omega_m0 - omega_v0) + M*tI2 - I*M0*(1-tI2/3/t_i)*Math.pow(tI2, 2)/3/t_i);
						double f_tI3 = (M0*tI3/t_i*(2-tI3/t_i)) * ((omega_m0 - omega_v0) + M*tI3 - I*M0*(1-tI3/3/t_i)*Math.pow(tI3, 2)/3/t_i);
						double f_tII = M0 * ((omega_m0 - omega_v0) + M*tII - I*M0/3*(3*tII - t_i));
						Qcalore = t_i/2 * (wI1*f_tI1 + wI2*f_tI2 + wI3*f_tI3) + (t_s-t_i)/2 * wII*f_tII;
						slidingTimeHeat[2*i].setText(String.format("%.3f",t_s));
						slidingTimeHeat[2*i+1].setText(String.format("%.3f",Qcalore));
					}
					if (i == 0){
						tauGC = tau_i * tau_p;
						etaGC = etaM;
						omega0 = (omega_m0 - omega_v0);
						t_sGC = t_s;
						QcaloreGC = Qcalore;
					}
				}
				
				// calculation of the clutch geometric characteristics
				double L = 5.89 * Cmax * Q * Math.pow(Reff/100, 2) / (tauGC*(Cmax*tauGC*etaGC - 0.018*Q*Reff/100)) * Math.pow(nCmax/100, 2);
				double ri = Math.sqrt((L / (200 / (Q / Pmax))) / (2*Math.PI*(Math.pow(1.4, 2) - 1)));
				double re = 1.4 * ri;
				double Sclutch = Math.PI * (Math.pow(re, 2) - Math.pow(ri, 2));
				double s = ((390000 * L * 0.0000018)/Sclutch)/10 + 3;
				textField_superficie.setText(String.format("%.3f",Sclutch));
				textField_raggioInt.setText(String.format("%.3f",ri));
				textField_raggioEst.setText(String.format("%.3f",re));
				textField_spessore.setText(String.format("%.3f",s));
				
				// structural verification
				double rmUP = (Math.pow(re,3) - Math.pow(ri,3))/(Math.pow(re,2) - Math.pow(ri,2)) * 2/3;
				double rmUW = (re + ri)/2;
				double FcUP = 1.15 * Cmax / (2 * 0.4 * rmUP);
				double FcUW = 1.15 * Cmax / (2 * 0.4 * rmUW);
				double pmUP = FcUP / (Math.PI * Math.pow(rmUP,2));
				double pmaxUP = FcUP / (Math.PI * (Math.pow(re,2) - Math.pow(ri,2)));
				double pmUW = FcUW / (Math.PI * Math.pow(rmUW,2));
				double pmaxUW = FcUW / (Math.PI * (Math.pow(re,2) - Math.pow(ri,2)));
				if (pmUP<35 && pmUW<35 && pmaxUP<55 && pmaxUW<55){
					checkBox_1.setSelected(true);
				}
				
				// thermal verification
				double H = 0.00381/Math.sqrt(2.23e-5) + 0.011/Math.sqrt(1.178e-5);
				double thMax = M0 * omega0 / H / Sclutch * Math.sqrt(2*t_sGC/Math.PI) * 2/3;
				if (thMax < 650){
					checkBox_2.setSelected(true);
				}
				
				// repetitive shifts
				double deltaTH = 36.23/19535.34 * QcaloreGC;
				double niTheor = deltaTH / 2700;
				double niEff = 50.5 * re/100 * s/1000;
				if (niEff > niTheor){
					checkBox_3.setSelected(true);
				}
				
				// continuous sliding
				double tSlitt = 205011475 / Math.pow(Cmax, 2) * Math.pow(3000/nCmax, 2) * Math.pow(Sclutch/10000, 2);
				if (tSlitt < 10){
					double SclutchSlitt = 0.06716/264.5/3000 * Cmax * nCmax;
					double riNew = Math.sqrt(SclutchSlitt / (2*Math.PI*(Math.pow(1.4, 2) - 1)));
					double reNew = 1.4 * riNew;
					lblrarr.setVisible(true);
					lblraggioInternoModificato.setVisible(true);
					lblraggioEsternoModificato.setVisible(true);
					textField_raggioIntNew.setVisible(true);
					textField_raggioEstNew.setVisible(true);
					checkBox_4.setSelected(false);
					textField_raggioIntNew.setText(String.format("%.3f",100*riNew));
					textField_raggioEstNew.setText(String.format("%.3f",100*reNew));
				}
				else{
					lblrarr.setVisible(false);
					lblraggioInternoModificato.setVisible(false);
					lblraggioEsternoModificato.setVisible(false);
					textField_raggioIntNew.setVisible(false);
					textField_raggioEstNew.setVisible(false);
					checkBox_4.setSelected(true);
				}
				
				// calculate smallest gear ratio
				double tauOtt = 1;
				double err = 1000;
				while (err > 0.1){
					tauOtt = tauOtt + 0.00001;
					double TSmallGear = Pmax*1000 * 60/2/Math.PI * tauOtt/nPmax/(Reff/100);
					double RaSmallGear = 0.5 * 1.225 * Double.parseDouble(textField_Cx.getText()) * S * Math.pow(2*Math.PI/60*nPmax/tauOtt*(Reff/100),2);
					double RrSmallGear = K*Q/1000*(5.1 + (5.5+(18*Q/1000))/2.2 + (8.5+(6*Q/1000))/2.2*Math.pow(2*Math.PI/60*nPmax/tauOtt*3.6/100, 2));
					err = Math.abs(TSmallGear - RaSmallGear - RrSmallGear);
				}
				double tauSmallGear = tauOtt / Double.parseDouble(textField_tauP.getText());
				textField_tauMax.setText(String.format("%.3f",tauSmallGear));
				
				// calculate highest gear ratio (maximum slope)
				double lRear = (Double.parseDouble(textField_passo.getText()) - Double.parseDouble(textField_semipassoAnt.getText()))/1000; 
				double Tmax0 = 0.9 * Q * (lRear + 0.018*0.4)/(Double.parseDouble(textField_passo.getText())/1000 + 0.9*0.4) * 9.81;
				double alphaMax = Math.atan(Tmax0/Q/9.81 - 0.018);
				double tauIMaxSlope = Tmax0 * Math.cos(alphaMax) * (Reff/100) / Cmax / Double.parseDouble(textField_tauP.getText());
				textField_tauMinAlpha.setText(String.format("%.3f",tauIMaxSlope));
				
				// calculate highest gear ratio (maximum acceleration)
				double tauIMaxAccel = tauIMaxSlope / Math.cos(alphaMax);
				textField_tauMaxAderenza.setText(String.format("%.3f",tauIMaxAccel));
				
				// calculate highest gear ratio (minimum velocity)
				double tauIMinVel = 2*Math.PI/60 *1000 / (8/3.6) / Double.parseDouble(textField_tauP.getText()) * (Reff/100);
				textField_tauMinPassoUomo.setText(String.format("%.3f",tauIMinVel));
				
				// calculate intermediate gears (geometric progression)
				double exponentGeom = 1.0/(nI-1);
				double kGeom = Math.pow(Double.parseDouble(gearRatios[0].getText())/Double.parseDouble(gearRatios[nI-1].getText()),exponentGeom);
				double gearsGeom[] = new double[nI];
				gearsGeom[0] = Double.parseDouble(gearRatios[0].getText());
				for (int i = 1; i < nI; i++){
					gearsGeom[i] = gearsGeom[i-1]/kGeom; 
				}
				for (int i = 0; i < nI; i++){
					gearRatiosGeom[i].setText(String.format("%.3f",gearsGeom[i]));
				}
				
				// calculate intermediate gears (close shifts)
				double exponentClose = 1.0/(Math.pow(nI, 2)/2 + nI/2 - 1);
				double kClose = Math.pow(Double.parseDouble(gearRatios[0].getText())/Double.parseDouble(gearRatios[nI-1].getText()),exponentClose);
				double gearsClose[] = new double[nI];
				gearsClose[nI-1] = Double.parseDouble(gearRatios[nI-1].getText());
				for (int i = 1; i < nI; i++){
					gearsClose[nI-i-1] = gearsClose[nI-i]*Math.pow(kClose,i+1);
				}
				for (int i = 0; i < nI; i++){
					gearRatiosClose[i].setText(String.format("%.3f",gearsClose[i]));
				}
				
				tauTGeomString = "[";
				for (int i = 0; i < nI; i++){
					tauTGeomString += Double.toString(gearsGeom[i]);
					if (i < nI-1){
						tauTGeomString += " , ";
					}
				}
				tauTGeomString += "]";
				tauTCloseString = "[";
				for (int i = 0; i < nI; i++){
					tauTCloseString += Double.toString(gearsClose[i]);
					if (i < nI-1){
						tauTCloseString += " , ";
					}
				}
				tauTCloseString += "]";
				tauPString = textField_tauP.getText();
				ReffString = Double.toString(Reff/100);
				nMaxString = Double.toString(nPmax*1.1);
				
				// 0-100 km/h
				double aPrime = Math.pow(60/2/Math.PI, 3) * Math.pow(tau_p / (Reff/100), 3) * Xmatrix.get(0,0);
				double bPrime = Math.pow(60/2/Math.PI, 2) * Math.pow(tau_p / (Reff/100), 2) * Xmatrix.get(1,0);
				double cPrime = 60/2/Math.PI * tau_p / (Reff/100) * Xmatrix.get(2,0);
				double RaCoeff = aeroCoeff;
				double RrConst = K*Q/1000*(5.1 + (5.5+(18*Q/1000))/2.2)*9.81;
				double RrQuadr = K*Q/1000*(8.5+(6*Q/1000))*Math.pow(3.6/100,2) / 2.2*9.81;
				int lastGear = 0;
				for (int i = 0; i < nI; i++){
					if (2*Math.PI/60*nPmax/tau_p/Double.parseDouble(gearRatios[i].getText())*(Reff/100) > 100/3.6){
						lastGear = i;
						break;
					}
				}
				double V1 = 0;
				double V2 = 0;
				double alpha = 0;
				double beta = 0;
				double gamma = 0;
				double Dt0100 = 0;
				for (int i = 0; i <= lastGear; i++){
					if (i!=0)
						V1 = 2*Math.PI/60*nPmax/tau_p/Double.parseDouble(gearRatios[i-1].getText())*(Reff/100);
					else
						V1 = 0;
					if (i!=lastGear)
						V2 = 2*Math.PI/60*nPmax/tau_p/Double.parseDouble(gearRatios[i].getText())*(Reff/100);
					else
						V2 = 100/3.6;
					alpha = 0.97*aPrime * Math.pow(Double.parseDouble(gearRatios[i].getText()), 3) - RrQuadr - RaCoeff;
					beta = 0.97*bPrime * Math.pow(Double.parseDouble(gearRatios[i].getText()), 2);
					gamma = 0.97*cPrime * Double.parseDouble(gearRatios[i].getText()) - RrConst;
					double mr = Q + 0.0025*Q*Math.pow(tau_p * Double.parseDouble(gearRatios[i].getText()), 2);
					double delta = Math.pow(beta, 2) - 4*alpha*gamma;
					double deltaSR = 0;
					if (delta > 0){
						deltaSR = Math.sqrt(delta);
						Dt0100 += mr/deltaSR * Math.log((2*alpha*V2+beta-deltaSR)*(2*alpha*V1+beta+deltaSR)/(2*alpha*V2+beta+deltaSR)/(2*alpha*V1+beta-deltaSR));						
					}
					else{
						deltaSR = Math.sqrt(-delta);
						Dt0100 += mr*2/deltaSR * Math.atan((2*alpha*V2+beta)/deltaSR) - Math.atan((2*alpha*V1+beta)/deltaSR);
					}
					Dt0100 += 0.3;
				}
				// 80-120 km/h with last gear
				double lastTau = Double.parseDouble(gearRatios[nI-1].getText());
				V1 = 80/3.6;
				V2 = 120/3.6;
				alpha = 0.8*aPrime * Math.pow(lastTau, 3) - RrQuadr - RaCoeff;
				beta = 0.8*bPrime * Math.pow(lastTau, 2);
				gamma = 0.8*cPrime * lastTau - RrConst;
				double mr = Q + 0.0025*Q*Math.pow(tau_p * lastTau, 2);
				double delta = Math.pow(beta, 2) - 4*alpha*gamma;
				double deltaSR = 0;
				double Dt80120 = 0;
				if (delta > 0){
					deltaSR = Math.sqrt(delta);
					Dt80120 = mr/deltaSR * Math.log((2*alpha*V2+beta-deltaSR)*(2*alpha*V1+beta+deltaSR)/(2*alpha*V2+beta+deltaSR)/(2*alpha*V1+beta-deltaSR));						
				}
				else{
					deltaSR = Math.sqrt(-delta);
					Dt80120 = mr*2/deltaSR * Math.atan((2*alpha*V2+beta)/deltaSR) - Math.atan((2*alpha*V1+beta)/deltaSR);
				}
				// 0-400 m
				double Ds = 0;
				double DsTest = 0;
				for (int i = 0; i < nI; i++){
					mr = Q + 0.0025*Q*Math.pow(tau_p * Double.parseDouble(gearRatios[i].getText()), 2);
					alpha = 0.95*aPrime * Math.pow(Double.parseDouble(gearRatios[i].getText()), 3) - RrQuadr - RaCoeff;
					beta = 0.95*bPrime * Math.pow(Double.parseDouble(gearRatios[i].getText()), 2);
					gamma = 0.95*cPrime * Double.parseDouble(gearRatios[i].getText()) - RrConst;
					if (i!=0){
						V1 = 2*Math.PI/60*nPmax/tau_p/Double.parseDouble(gearRatios[i-1].getText())*(Reff/100);
					}
					else{
						V1 = 0;
					}
					V2 = 2*Math.PI/60*nPmax/tau_p/Double.parseDouble(gearRatios[i].getText())*(Reff/100);
					deltaSR = 0;
					delta = Math.pow(beta, 2) - 4*alpha*gamma;
					double DDs = 0;
					if (delta > 0){
						deltaSR = Math.sqrt(delta);
						DDs = mr/deltaSR * Math.log((2*alpha*V2+beta-deltaSR)*(2*alpha*V1+beta+deltaSR)/(2*alpha*V2+beta+deltaSR)/(2*alpha*V1+beta-deltaSR));						
					}
					else{
						deltaSR = Math.sqrt(-delta);
						DDs= mr*2/deltaSR * Math.atan((2*alpha*V2+beta)/deltaSR) - Math.atan((2*alpha*V1+beta)/deltaSR);
					}
					DsTest = Ds + 0.5*(V2+V1)*DDs;//mr/2/alpha * (Math.log(alpha*Math.pow(V2,2)+beta*V2+gamma)-Math.log(alpha*Math.pow(V1,2)+beta*V1+gamma)) - mr*beta/2/alpha * DDs;
					if (DsTest < 400){
						Ds = DsTest;
					}
					else{
						while (Math.abs(DsTest - 400) > 0.1){
							V2 = V2 - 0.001;
							if (delta > 0){
								deltaSR = Math.sqrt(delta);
								DDs = mr/deltaSR * Math.log((2*alpha*V2+beta-deltaSR)*(2*alpha*V1+beta+deltaSR)/(2*alpha*V2+beta+deltaSR)/(2*alpha*V1+beta-deltaSR));						
							}
							else{
								deltaSR = Math.sqrt(-delta);
								DDs= mr*2/deltaSR * Math.atan((2*alpha*V2+beta)/deltaSR) - Math.atan((2*alpha*V1+beta)/deltaSR);
							}
							DsTest = Ds + 0.5*(V2+V1)*DDs;// + mr/2/alpha * (Math.log(alpha*Math.pow(V2,2)+beta*V2+gamma)-Math.log(alpha*Math.pow(V1,2)+beta*V1+gamma)) - mr*beta/2/alpha * DDs;
						}
						Ds = DsTest;
						break;
					}
				}	
				double V2400 = V2;
				for (int i = 0; i < nI; i++){
					if (2*Math.PI/60*nPmax/tau_p/Double.parseDouble(gearRatios[i].getText())*(Reff/100) > V2400){
						lastGear = i;
						break;
					}
				}
				double Dt400 = 0;
				for (int i = 0; i <= lastGear; i++){
					if (i!=0)
						V1 = 2*Math.PI/60*nPmax/tau_p/Double.parseDouble(gearRatios[i-1].getText())*(Reff/100);
					else
						V1 = 0;
					if (i!=lastGear)
						V2 = 2*Math.PI/60*nPmax/tau_p/Double.parseDouble(gearRatios[i].getText())*(Reff/100);
					else
						V2 = V2400;
					alpha = 0.97*aPrime * Math.pow(Double.parseDouble(gearRatios[i].getText()), 3) - RrQuadr - RaCoeff;
					beta = 0.97*bPrime * Math.pow(Double.parseDouble(gearRatios[i].getText()), 2);
					gamma = 0.97*cPrime * Double.parseDouble(gearRatios[i].getText()) - RrConst;
					mr = Q + 0.0025*Q*Math.pow(tau_p * Double.parseDouble(gearRatios[i].getText()), 2);
					delta = Math.pow(beta, 2) - 4*alpha*gamma;
					deltaSR = 0;
					if (delta > 0){
						deltaSR = Math.sqrt(delta);
						Dt400 += mr/deltaSR * Math.log((2*alpha*V2+beta-deltaSR)*(2*alpha*V1+beta+deltaSR)/(2*alpha*V2+beta+deltaSR)/(2*alpha*V1+beta-deltaSR));						
					}
					else{
						deltaSR = Math.sqrt(-delta);
						Dt400 += mr*2/deltaSR * Math.atan((2*alpha*V2+beta)/deltaSR) - Math.atan((2*alpha*V1+beta)/deltaSR);
					}
					Dt400 += 0.3;
				}
				// 0-1000 m
				Ds = 0;
				DsTest = 0;
				for (int i = 0; i < nI; i++){
					mr = Q + 0.0025*Q*Math.pow(tau_p * Double.parseDouble(gearRatios[i].getText()), 2);
					alpha = 0.95*aPrime * Math.pow(Double.parseDouble(gearRatios[i].getText()), 3) - RrQuadr - RaCoeff;
					beta = 0.95*bPrime * Math.pow(Double.parseDouble(gearRatios[i].getText()), 2);
					gamma = 0.95*cPrime * Double.parseDouble(gearRatios[i].getText()) - RrConst;
					if (i!=0){
						V1 = 2*Math.PI/60*nPmax/tau_p/Double.parseDouble(gearRatios[i-1].getText())*(Reff/100);
					}
					else{
						V1 = 0;
					}
					V2 = 2*Math.PI/60*nPmax/tau_p/Double.parseDouble(gearRatios[i].getText())*(Reff/100);
					deltaSR = 0;
					delta = Math.pow(beta, 2) - 4*alpha*gamma;
					double DDs = 0;
					if (delta > 0){
						deltaSR = Math.sqrt(delta);
						DDs = mr/deltaSR * Math.log((2*alpha*V2+beta-deltaSR)*(2*alpha*V1+beta+deltaSR)/(2*alpha*V2+beta+deltaSR)/(2*alpha*V1+beta-deltaSR));						
					}
					else{
						deltaSR = Math.sqrt(-delta);
						DDs= mr*2/deltaSR * Math.atan((2*alpha*V2+beta)/deltaSR) - Math.atan((2*alpha*V1+beta)/deltaSR);
					}
					DsTest = Ds + 0.5*(V2+V1)*DDs;//mr/2/alpha * (Math.log(alpha*Math.pow(V2,2)+beta*V2+gamma)-Math.log(alpha*Math.pow(V1,2)+beta*V1+gamma)) - mr*beta/2/alpha * DDs;
					if (DsTest < 1000){
						Ds = DsTest;
					}
					else{
						while (Math.abs(DsTest - 1000) > 0.1){
							V2 = V2 - 0.001;
							if (delta > 0){
								deltaSR = Math.sqrt(delta);
								DDs = mr/deltaSR * Math.log((2*alpha*V2+beta-deltaSR)*(2*alpha*V1+beta+deltaSR)/(2*alpha*V2+beta+deltaSR)/(2*alpha*V1+beta-deltaSR));						
							}
							else{
								deltaSR = Math.sqrt(-delta);
								DDs= mr*2/deltaSR * Math.atan((2*alpha*V2+beta)/deltaSR) - Math.atan((2*alpha*V1+beta)/deltaSR);
							}
							DsTest = Ds + 0.5*(V2+V1)*DDs;// + mr/2/alpha * (Math.log(alpha*Math.pow(V2,2)+beta*V2+gamma)-Math.log(alpha*Math.pow(V1,2)+beta*V1+gamma)) - mr*beta/2/alpha * DDs;
						}
						Ds = DsTest;
						break;
					}
				}	
				double V21000 = V2;
				for (int i = 0; i < nI; i++){
					if (2*Math.PI/60*nPmax/tau_p/Double.parseDouble(gearRatios[i].getText())*(Reff/100) > V21000){
						lastGear = i;
						break;
					}
				}
				double Dt1000 = 0;
				for (int i = 0; i <= lastGear; i++){
					if (i!=0)
						V1 = 2*Math.PI/60*nPmax/tau_p/Double.parseDouble(gearRatios[i-1].getText())*(Reff/100);
					else
						V1 = 0;
					if (i!=lastGear)
						V2 = 2*Math.PI/60*nPmax/tau_p/Double.parseDouble(gearRatios[i].getText())*(Reff/100);
					else
						V2 = V21000;
					alpha = 0.97*aPrime * Math.pow(Double.parseDouble(gearRatios[i].getText()), 3) - RrQuadr - RaCoeff;
					beta = 0.97*bPrime * Math.pow(Double.parseDouble(gearRatios[i].getText()), 2);
					gamma = 0.97*cPrime * Double.parseDouble(gearRatios[i].getText()) - RrConst;
					mr = Q + 0.0025*Q*Math.pow(tau_p * Double.parseDouble(gearRatios[i].getText()), 2);
					delta = Math.pow(beta, 2) - 4*alpha*gamma;
					deltaSR = 0;
					if (delta > 0){
						deltaSR = Math.sqrt(delta);
						Dt1000 += mr/deltaSR * Math.log((2*alpha*V2+beta-deltaSR)*(2*alpha*V1+beta+deltaSR)/(2*alpha*V2+beta+deltaSR)/(2*alpha*V1+beta-deltaSR));						
					}
					else{
						deltaSR = Math.sqrt(-delta);
						Dt1000 += mr*2/deltaSR * Math.atan((2*alpha*V2+beta)/deltaSR) - Math.atan((2*alpha*V1+beta)/deltaSR);
					}
					Dt1000 += 0.3;
				}
				textField_0100.setText(String.format("%.2f",Dt0100));
				textField_80120.setText(String.format("%.2f",Dt80120));
				textField_400.setText(String.format("%.2f",Dt400));
				textField_400v.setText(String.format("%.2f",V2400*3.6));
				textField_1000.setText(String.format("%.2f",Dt1000));
				textField_1000v.setText(String.format("%.2f",V21000*3.6));
				
				// test "tipo 0"
				double Sp = (Double.parseDouble(textField_passo.getText()) - Double.parseDouble(textField_semipassoAnt.getText()))/1000;
				double Sa = Double.parseDouble(textField_semipassoAnt.getText())/1000;
				double Sap = Sp + Sa;
				double betaAp = (Sa - 0.4 * (0.02 + 0.68))/(Sp + 0.4 * (0.02 + 0.68));
				double Fap = 0.68*(Q*1.25)*9.81;
				double Fa = Fap/(1+betaAp);
				double Fp = Fa*betaAp;
				double Ma1w0 = Fa/2*(Reff/100); // momento anteriore 1 wheel tipo 0
				double Mp1w0 = Fp/2*(Reff/100);
				
				// test "tipo 1"
				double etaG = (Sp + 0.4 * (0.020 + 0.35))*(1+betaAp)/Sap;
				Fap = etaG*0.35*(Q*1.25)*9.81;
				Fa = Fap/(1+betaAp);
				Fp = Fa*betaAp;
				double Ma1w1 = Fa/2*(Reff/100); // momento anteriore 1 wheel tipo 1
				double Mp1w1 = Fp/2*(Reff/100);
				
				// brakes surface
				double Qca = 0.97*(Sp/Sap)*(Q*1.25)*(Math.pow(120, 2) - Math.pow(80, 2))/4/9.81;
				double Qcp = 0.97*(Sa/Sap)*(Q*1.25)*(Math.pow(120, 2) - Math.pow(80, 2))/4/9.81;
				double Aa1w = Qca/(502*(400-25)*45*(8.5e-7*0.07 + 4.5e-9*Math.pow(120/3.6,0.8)))/2;
				double Ap1w = Qcp/(502*(400-25)*45*(8.5e-7*0.07 + 4.5e-9*Math.pow(120/3.6,0.8)))/2;
				double rea = Math.sqrt(Aa1w/(Math.PI*(1-Math.pow(0.75,2))));
				double ria = 0.75*rea;
				double rep = Math.sqrt(Ap1w/(Math.PI*(1-Math.pow(0.75,2))));
				double rip = 0.75*rep;
				
				// brake pads thickness
				double Vta = 2*Qca/2*22222 * 4.8e-6;
				double Vtp = 2*Qcp/2*22222 * 4.8e-6;
				double thetaA = 2*Ma1w0/(0.02*1e6*(Math.pow(rea/1000, 2) - Math.pow(ria/1000, 2)))*180/Math.PI/2;
				double thetaP = 2*Mp1w0/(0.02*1e6*(Math.pow(rep/1000, 2) - Math.pow(rip/1000, 2)))*180/Math.PI/2;
				double areaA = thetaA*Math.PI/180/2 * (Math.pow(rea, 2) - Math.pow(ria, 2));
				double areaP = thetaP*Math.PI/180/2 * (Math.pow(rep, 2) - Math.pow(rip, 2));
				double sA = Vta / areaA;
				double sP = Vtp / areaP;
				
				textField_Ca0.setText(String.format("%.2f",Ma1w0));
				textField_Cp0.setText(String.format("%.2f",Mp1w0));
				textField_Ca1.setText(String.format("%.2f",Ma1w1));
				textField_Cp1.setText(String.format("%.2f",Mp1w1));
				textField_rea.setText(String.format("%.2f",rea));
				textField_ria.setText(String.format("%.2f",ria));
				textField_areaA.setText(String.format("%.2f",areaA));
				textField_sA.setText(String.format("%.2f",Math.ceil(sA+5)));
				textField_rep.setText(String.format("%.2f",rep));
				textField_rip.setText(String.format("%.2f",rip));
				textField_areaP.setText(String.format("%.2f",areaP));
				textField_sP.setText(String.format("%.2f",Math.ceil(sP+5)));
				
				// enable button to generate graphs
				btnvisualizzaGrafici.setVisible(true);
				
			}
		});
		
		// generate graphs ---------------------------------------------------------------------------------------------------------------------
		btnvisualizzaGrafici.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				final String dir = System.getProperty("user.dir");
				try {
					Runtime.getRuntime().exec(new String[]{"/usr/local/bin/matlab", "-nodesktop -r \"addpath('" + dir + "');"
							+ "fhandle1 = @calcoloCurveMotore; fhandle2 = @diagrammiImpiegoCambio;"
							+ "feval(fhandle1," + aString + "," + bString + "," + cString + "); "
							+ "feval(fhandle2," + tauTGeomString + "," + tauPString + "," + ReffString + "," + nMaxString + "); "
							+ "feval(fhandle2," + tauTCloseString + "," + tauPString + "," + ReffString + "," + nMaxString + ");"
							+ "h = get(0,'Children'); set(h(3),'Units','normalized','Position',[0.02 0.4 0.4 0.5]); set(h(2),'Units','normalized','Position',[0.3 0.25 0.4 0.5]); set(h(1),'Units','normalized','Position',[0.6 0.08 0.4 0.5]);\" "});
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		// load models
		mntmMitoTurbo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Alfa Rome MiTo 1.4 Turbo
				textField_cilindrata.setText(Integer.toString(1368));
				textField_massa.setText(Integer.toString(1363));
				textField_Pr.setText("R");
				textField_N100.setText(Double.toString(15.5));
				textField_eta100.setText(Double.toString(0.287));
				textField_larghezza.setText(Integer.toString(1721));
				textField_lunghezza.setText(Integer.toString(4063));
				textField_altezza.setText(Integer.toString(1446));
				textField_consumo.setText(String.format("%.5f",1/15.9));
				textField_potMax.setText(Integer.toString(114));
				textField_coppiaMax.setText(Integer.toString(230));
				textField_rpmPotMax.setText(Integer.toString(5500));
				textField_rpmCoppiaMax.setText(Integer.toString(3000));
				textField_Plarg.setText(Integer.toString(205));
				textField_PrappHL.setText(Integer.toString(45));
				textField_Pcerchio.setText(Integer.toString(17));
				textField_Pcarico.setText(Integer.toString(91));
				textField_Pvelocita.setText("W");
				textField_passo.setText(Integer.toString(2511));
				textField_semipassoAnt.setText(Integer.toString(929));
				textField_Cx.setText(Double.toString(0.29));
				textField_tauP.setText(Double.toString(4.176));
				textField_Nmarce.setText(Integer.toString(6));
				textField_tauI.setText(Double.toString(3.818));
				textField_tauII.setText(Double.toString(2.158));
				textField_tauIII.setText(Double.toString(1.475));
				textField_tauIV.setText(Double.toString(1.067));
				textField_tauV.setText(Double.toString(0.875));
				textField_tauVI.setText(Double.toString(0.744));
				rdbtnBenzina.setSelected(true);
				rdbtnMonodisco.setSelected(true);
				rdbtnAnteriore.setSelected(true);
			}
		});
		
		mntmS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Audi S3 Limousine
				textField_cilindrata.setText(Integer.toString(1984));
				textField_massa.setText(Integer.toString(1505));
				textField_Pr.setText("R");
				textField_N100.setText(Double.toString(15));
				textField_eta100.setText(Double.toString(0.29));
				textField_larghezza.setText(Integer.toString(1796));
				textField_lunghezza.setText(Integer.toString(4469));
				textField_altezza.setText(Integer.toString(1392));
				textField_consumo.setText(String.format("%.5f",1/16.5));
				textField_potMax.setText(Integer.toString(224));
				textField_coppiaMax.setText(Integer.toString(380));
				textField_rpmPotMax.setText(Integer.toString(6500));
				textField_rpmCoppiaMax.setText(Integer.toString(3650));
				textField_Plarg.setText(Integer.toString(225));
				textField_PrappHL.setText(Integer.toString(40));
				textField_Pcerchio.setText(Integer.toString(18));
				textField_Pcarico.setText(" ");
				textField_Pvelocita.setText(" ");
				textField_passo.setText(Integer.toString(2631));
				textField_semipassoAnt.setText(Integer.toString(1078));
				textField_Cx.setText(Double.toString(0.31));
				textField_tauP.setText(Double.toString(3.755));
				textField_Nmarce.setText(Integer.toString(6));
				textField_tauI.setText(Double.toString(3.794));
				textField_tauII.setText(Double.toString(2.360));
				textField_tauIII.setText(Double.toString(1.660));
				textField_tauIV.setText(Double.toString(1.230));
				textField_tauV.setText(Double.toString(0.958));
				textField_tauVI.setText(Double.toString(0.792));
				rdbtnBenzina.setSelected(true);
				rdbtnMonodisco.setSelected(true);
				rdbtnIntegrale.setSelected(true);
			}
		});
		
		mntmRs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Audi RS7
				/*textField_cilindrata.setText(Integer.toString(1368));
				textField_massa.setText(Integer.toString(1363));
				textField_Pr.setText("R");
				textField_N100.setText(Double.toString(15.5));
				textField_eta100.setText(Double.toString(0.287));
				textField_larghezza.setText(Integer.toString(1721));
				textField_lunghezza.setText(Integer.toString(4063));
				textField_altezza.setText(Integer.toString(1446));
				textField_consumo.setText(String.format("%.5f",1/15.9));
				textField_potMax.setText(Integer.toString(114));
				textField_coppiaMax.setText(Integer.toString(230));
				textField_rpmPotMax.setText(Integer.toString(5500));
				textField_rpmCoppiaMax.setText(Integer.toString(3000));
				textField_Plarg.setText(Integer.toString(205));
				textField_PrappHL.setText(Integer.toString(45));
				textField_Pcerchio.setText(Integer.toString(17));
				textField_Pcarico.setText(Integer.toString(91));
				textField_Pvelocita.setText("W");
				textField_passo.setText(Integer.toString(2511));
				textField_semipassoAnt.setText(Integer.toString(929));
				textField_Cx.setText(Double.toString(0.29));
				textField_tauP.setText(Double.toString(4.176));
				textField_Nmarce.setText(Integer.toString(6));
				textField_tauI.setText(Double.toString(3.818));
				textField_tauII.setText(Double.toString(2.158));
				textField_tauIII.setText(Double.toString(1.475));
				textField_tauIV.setText(Double.toString(1.067));
				textField_tauV.setText(Double.toString(0.875));
				textField_tauVI.setText(Double.toString(0.744));
				rdbtnBenzina.setSelected(true);
				rdbtnMonodisco.setSelected(true);
				rdbtnIntegrale.setSelected(true);*/
			}
		});
		
		mntmTt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Audi TT
				/*textField_cilindrata.setText(Integer.toString(1368));
				textField_massa.setText(Integer.toString(1363));
				textField_Pr.setText("R");
				textField_N100.setText(Double.toString(15.5));
				textField_eta100.setText(Double.toString(0.287));
				textField_larghezza.setText(Integer.toString(1721));
				textField_lunghezza.setText(Integer.toString(4063));
				textField_altezza.setText(Integer.toString(1446));
				textField_consumo.setText(String.format("%.5f",1/15.9));
				textField_potMax.setText(Integer.toString(114));
				textField_coppiaMax.setText(Integer.toString(230));
				textField_rpmPotMax.setText(Integer.toString(5500));
				textField_rpmCoppiaMax.setText(Integer.toString(3000));
				textField_Plarg.setText(Integer.toString(205));
				textField_PrappHL.setText(Integer.toString(45));
				textField_Pcerchio.setText(Integer.toString(17));
				textField_Pcarico.setText(Integer.toString(91));
				textField_Pvelocita.setText("W");
				textField_passo.setText(Integer.toString(2511));
				textField_semipassoAnt.setText(Integer.toString(929));
				textField_Cx.setText(Double.toString(0.29));
				textField_tauP.setText(Double.toString(4.176));
				textField_Nmarce.setText(Integer.toString(6));
				textField_tauI.setText(Double.toString(3.818));
				textField_tauII.setText(Double.toString(2.158));
				textField_tauIII.setText(Double.toString(1.475));
				textField_tauIV.setText(Double.toString(1.067));
				textField_tauV.setText(Double.toString(0.875));
				textField_tauVI.setText(Double.toString(0.744));
				rdbtnBenzina.setSelected(true);
				rdbtnMonodisco.setSelected(true);
				rdbtnIntegrale.setSelected(true);*/
			}
		});
		
		// close app
		mntmEsci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmSoftwareDiCalcolo.dispose();
			}
		});
		
		
		
		// -------------------------------------------------------------------------------------------------------------------------------------
		// -------------------------------------------------------------------------------------------------------------------------------------
		// -------------------------------------------------------------------------------------------------------------------------------------
		
	}
}
	