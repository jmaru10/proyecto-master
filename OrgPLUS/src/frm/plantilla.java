package frm;

import java.io.BufferedReader;

import java.io.FileOutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import orgplus.OrgPLUS;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class plantilla extends javax.swing.JFrame {

	// objeto de la clase OrgPLUS donde estan los metodos de ordenar por tallas
	OrgPLUS plu = new OrgPLUS();

	// variables para filas y columnas del archivo plano
	int nfilas;
	int ncol;

	// Obtener el archivo plano de los metriales y las tallas
	private final String ruta = System.getProperties().getProperty("user.dir");
	File archivo = null;
	FileReader leer = null;
	BufferedReader buferleer = null;
	private DefaultTableModel modelo;
	private DefaultTableModel modelo2;

	// constructor
	public plantilla() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(plantilla.class.getResource("/icono/descarga.png")));

		initComponents();
		setLocationRelativeTo(null);
		this.setResizable(false);

	}

	int cont2 = 0;

	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jScrollPane2 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jPanel1 = new javax.swing.JPanel();
		btnImportar = new javax.swing.JButton();
		BtnEjecutar = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		LblTablaBase = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		LblTituloPrincipal = new javax.swing.JLabel();
		BtnAtras = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		jScrollPane4 = new javax.swing.JScrollPane();
		jTable3 = new javax.swing.JTable();
		jLabel1 = new javax.swing.JLabel();

		jTable2.setModel(
				new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
		jScrollPane2.setViewportView(jTable2);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(java.awt.SystemColor.activeCaption);
		setForeground(java.awt.SystemColor.activeCaption);
		setMaximumSize(new java.awt.Dimension(2000, 2000));

		jPanel1.setBackground(java.awt.SystemColor.activeCaption);

		btnImportar.setBackground(new java.awt.Color(255, 255, 255));
		btnImportar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		btnImportar.setText("Cargar Archivo.txt ");
		btnImportar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnImportarActionPerformed(evt);
			}
		});

		BtnEjecutar.setBackground(new java.awt.Color(255, 255, 255));
		BtnEjecutar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		BtnEjecutar.setText("Ejecutar ");
		BtnEjecutar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				BtnEjecutarActionPerformed(evt);
			}
		});

		jButton1.setBackground(new java.awt.Color(255, 255, 255));
		jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		jButton1.setText("Generar Tabla Principal");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jTable1.setBackground(java.awt.SystemColor.inactiveCaption);
		jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] {

		}));
		jScrollPane1.setViewportView(jTable1);

		LblTablaBase.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		LblTablaBase.setText("Tabla base ");

		JButton btnGenerarExcel = new JButton("Generar excel");
		btnGenerarExcel.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				Workbook book = new HSSFWorkbook();

				Sheet sheet = book.createSheet("Numeros PLU");

				for (int i = 0; i < jTable3.getRowCount(); i++) {
					Row row = sheet.createRow(i);
					for (int j = 0; j < jTable3.getColumnCount(); j++) {
						Cell celda = row.createCell(j);
						if (jTable3.getValueAt(i, j) == null) {
							celda.setCellValue(String.valueOf(" "));
						} else if (jTable3.getValueAt(i, j) instanceof Double) {
							celda.setCellValue(Double.parseDouble(jTable3.getValueAt(i, j).toString()));
						} else if (jTable3.getValueAt(i, j) instanceof Float) {
							celda.setCellValue(Float.parseFloat((String) jTable3.getValueAt(i, j)));
						} else {
							celda.setCellValue(String.valueOf(jTable3.getValueAt(i, j)));
						}
					}

				}

				Sheet sheet1 = book.createSheet("Status AP");

				for (int i = 0; i < jTable3.getRowCount(); i++) {
					Row row1 = sheet1.createRow(i);
					for (int j = 0; j < jTable3.getColumnCount(); j++) {

						Cell celda1 = row1.createCell(j);

						if (j == 0) {

							celda1.setCellValue(String.valueOf(jTable3.getValueAt(i, j)));
						}

						if (j == 1) {

							celda1.setCellValue("CO11");
						}

						if (j == 2) {

							celda1.setCellValue(String.valueOf(jTable3.getValueAt(i, 28)));
						}
						if (j == 3) {

							celda1.setCellValue(String.valueOf(jTable3.getValueAt(i, jTable3.getColumnCount() - 1)));
						}

						if (j == 7) {

							celda1.setCellValue("01");
						}

						if (j == 8) {

							celda1.setCellValue("AP");
						}
						if (j == 9) {

							celda1.setCellValue("20140101");
						}
						if (j == 11) {

							celda1.setCellValue("104");
						}

					}

				}

				try {

					FileOutputStream file = new FileOutputStream("Registro PLU y AP.xls");
					book.write(file);
					file.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				JOptionPane.showMessageDialog(null, "Creado con exito");

			}
		});

		btnGenerarExcel.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGenerarExcel.setBackground(new Color(240, 240, 240));
		btnGenerarExcel.setForeground(Color.BLACK);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(22).addComponent(btnImportar)
										.addGap(37).addComponent(BtnEjecutar).addGap(41).addComponent(jButton1)
										.addGap(18).addComponent(btnGenerarExcel))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(57).addComponent(LblTablaBase)
										.addGap(51).addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 850,
												GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(177, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(BtnEjecutar)
								.addComponent(jButton1).addComponent(btnImportar).addComponent(btnGenerarExcel))
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(31).addComponent(jScrollPane1,
										GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(91).addComponent(LblTablaBase,
										GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(34, Short.MAX_VALUE)));
		jPanel1.setLayout(jPanel1Layout);

		jPanel3.setBackground(java.awt.SystemColor.activeCaption);

		LblTituloPrincipal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		LblTituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		LblTituloPrincipal.setText("UNIDADES DE MEDIDAS DE TODAS LAS MARCAS");

		BtnAtras.setBackground(java.awt.Color.white);
		BtnAtras.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		BtnAtras.setText("Atras ");
		BtnAtras.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				BtnAtrasActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3Layout.setHorizontalGroup(
			jPanel3Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(BtnAtras)
					.addPreferredGap(ComponentPlacement.RELATED, 395, Short.MAX_VALUE)
					.addComponent(LblTituloPrincipal, GroupLayout.PREFERRED_SIZE, 358, GroupLayout.PREFERRED_SIZE)
					.addGap(391))
		);
		jPanel3Layout.setVerticalGroup(
			jPanel3Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
					.addComponent(LblTituloPrincipal, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
					.addComponent(BtnAtras))
		);
		jPanel3.setLayout(jPanel3Layout);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE));

		jTable3.setBackground(java.awt.SystemColor.inactiveCaption);
		jTable3.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "MATERIAL", "CATEGORIA", "UN", "", "KG", "", "", "", "", "", "", "", "M", "DESCRIPCION", "UN",
				"1", "1", "", "", "", "", "", "M", "", "", "", "KG", "", "VM SAP", "MARCA1", "", "", "", "UN", "",
				"PLU", "ZL", "", "VM ORG", "MARCA " }));
		jTable3.setToolTipText("");
		jTable3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		jScrollPane4.setViewportView(jTable3);
		jTable3.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		jLabel1.setText("Tabla principal ");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addGroup(layout.createSequentialGroup().addGap(537, 537, 537).addComponent(jLabel1)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(8, 8, 8)
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel1)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane4,
								javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(22, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void BtnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BtnEjecutarActionPerformed

		if (BtnEjecutar.isSelected() == false && cont2 == 0) {
			cont2 = 1;

			Object[][] matriztabla = new Object[nfilas][ncol];

			// ciclo para llenar la mtriz con los elementos
			for (int i = 0; i < nfilas; i++) {
				for (int j = 0; j < ncol; j++) {

					matriztabla[i][j] = jTable1.getValueAt(i, j);
				}
			}

			Object[][] matrizdos = new Object[nfilas][2];

			for (int a = 0; a < nfilas; a++) {
				for (int b = 0; b < ncol; b++) {

					if (matriztabla[a][0] != null && matriztabla[a][1] != null) {

						matrizdos[a][0] = matriztabla[a][0];
						matrizdos[a][1] = matriztabla[a][1];

					}
				}
			}

			Object[][] matFila = new Object[nfilas][1];
			Object mat = matrizdos[0][0];

			String tallaXS = "XS", tallaXL = "XL", talla2 = "2 ", talla4 = "4 ", talla6 = "6 ", talla8 = "8 ",
					talla10 = "10", talla12 = "12", talla14 = "14", talla16 = "16", talla18 = "18", talla28 = "28",
					talla30 = "30", talla32 = "32", talla34 = "34", talla36 = "36", talla38 = "38", talla40 = "40",
					tallaSM = "SM", tallaML = "ML", tallaLXL = "LXL", talla30XS = "30XS", talla32S = "32S",
					talla34M = "34M", talla36L = "36L", talla38XL = "38XL", tallaXXS = "XXS";
			char tallacharS = 'S', tallacharM = 'M', tallacharL = 'L', tallacharU = 'U';

			String exterior = "EXTERIOR", interior = "INTERIOR", ropadeportiva = "ROPA DEPORTIVA",
					ropadormir = "ROPA DE DORMIR", ropaplaya = "ROPA DE PLAYA", fragancias = "FRAGANCIAS",
					joyeria = "JOYERIA", ofertas = "OFERTAS", maquillaje = "MAQUILLAJE",
					cuidadopersonal = "CUIDADO PERSONAL", paqueteCarmel = "PAQTE_COMPLETO CRML",
					paquetePacifika = "PAQTE_COMPLETO PCFK", paqueteLoguin = "PAQTE_COMPLETO LGIN",
					paqueteYerbabuena = "PAQTE_COMPLETO YBNA", multicategoria = "MULTICATEGORIA",
					multicategorias = "MULTICATEGORIAS", exteriorProteccion = "EXTERIOR PROTECCION",
					accesoriosProteccion = "ACCESORIOS PROTECCION", deportivoProteccion = "DEPORTIVO PROTECCION",
					proteccion = "PROTECCION";

			for (int q = 0; q < 1; q++) {
				for (int p = 0; p < nfilas; p++) {

					for (int k = 0; k < nfilas; k++) {
						for (int j = 0; j < 2; j++) {

							if (matrizdos[k][1] != null && (matrizdos[k][j]).toString().contains("30XS")
									| (matrizdos[k][j]).toString().contains("32S")
									| (matrizdos[k][j]).toString().contains("34M")
									| (matrizdos[k][j]).toString().contains("36L")
									| (matrizdos[k][j]).toString().contains("38XL")) {

								plu.TallaComoVariable(nfilas, mat, matrizdos, matFila, talla30XS);
								plu.TallaComoVariable(nfilas, mat, matrizdos, matFila, talla32S);
								plu.TallaComoVariable(nfilas, mat, matrizdos, matFila, talla34M);
								plu.TallaComoVariable(nfilas, mat, matrizdos, matFila, talla36L);
								plu.TallaComoVariable(nfilas, mat, matrizdos, matFila, talla38XL);

							} else {
								mat = matrizdos[p][q];
							}
						}
					}

					for (int k = 0; k < nfilas; k++) {
						for (int j = 0; j < 2; j++) {

							if (matrizdos[k][1] != null && (matrizdos[k][j]).toString().contains("XXS")
									| (matrizdos[k][j]).toString().contains("XS")
									| (matrizdos[k][j]).toString().charAt(1) == 'S'
									| (matrizdos[k][j]).toString().charAt(1) == 'M'
									| (matrizdos[k][j]).toString().charAt(1) == 'L'
									| (matrizdos[k][j]).toString().contains("XL")) {

								plu.TallaComoVariable(nfilas, mat, matrizdos, matFila, tallaXXS);
								plu.TallaComoVariable(nfilas, mat, matrizdos, matFila, tallaXS);
								plu.TallaComoVariableChar(nfilas, mat, matrizdos, matFila, tallacharS);
								plu.TallaComoVariableChar(nfilas, mat, matrizdos, matFila, tallacharM);
								plu.TallaComoVariableChar(nfilas, mat, matrizdos, matFila, tallacharL);
								plu.TallaComoVariable(nfilas, mat, matrizdos, matFila, tallaXL);
							} else {

								mat = matrizdos[p][q];
							}

						}
					}

					for (int k = 0; k < nfilas; k++) {
						for (int j = 0; j < 2; j++) {

							if (matrizdos[k][1] != null && (matrizdos[k][j]).toString().contains("2 ")
									| (matrizdos[k][j]).toString().contains("4 ")
									| (matrizdos[k][j]).toString().contains("6 ")
									| (matrizdos[k][j]).toString().contains("8 ")
									| (matrizdos[k][j]).toString().contains("10")
									| (matrizdos[k][j]).toString().contains("12")
									| (matrizdos[k][j]).toString().contains("14")
									| (matrizdos[k][j]).toString().contains("16")
									| (matrizdos[k][j]).toString().contains("18")) {

								plu.TallaComoVariable(nfilas, mat, matrizdos, matFila, talla2);
								plu.TallaComoVariable(nfilas, mat, matrizdos, matFila, talla4);
								plu.TallaComoVariable(nfilas, mat, matrizdos, matFila, talla6);
								plu.TallaComoVariable(nfilas, mat, matrizdos, matFila, talla8);
								plu.TallaComoVariable(nfilas, mat, matrizdos, matFila, talla10);
								plu.TallaComoVariable(nfilas, mat, matrizdos, matFila, talla12);
								plu.TallaComoVariable(nfilas, mat, matrizdos, matFila, talla14);
								plu.TallaComoVariable(nfilas, mat, matrizdos, matFila, talla16);
								plu.TallaComoVariable(nfilas, mat, matrizdos, matFila, talla18);

							} else {
								mat = matrizdos[p][q];
							}
						}
					}

					for (int k = 0; k < nfilas; k++) {
						for (int j = 0; j < 2; j++) {

							if (matrizdos[k][1] != null && (matrizdos[k][j]).toString().contains("28")
									| (matrizdos[k][j]).toString().contains("30")
									| (matrizdos[k][j]).toString().contains("32")
									| (matrizdos[k][j]).toString().contains("34")
									| (matrizdos[k][j]).toString().contains("36")
									| (matrizdos[k][j]).toString().contains("38")
									| (matrizdos[k][j]).toString().contains("40")) {

								plu.TallaComoVariable(nfilas, mat, matrizdos, matFila, talla28);
								plu.TallaComoVariable(nfilas, mat, matrizdos, matFila, talla30);
								plu.TallaComoVariable(nfilas, mat, matrizdos, matFila, talla32);
								plu.TallaComoVariable(nfilas, mat, matrizdos, matFila, talla34);
								plu.TallaComoVariable(nfilas, mat, matrizdos, matFila, talla36);
								plu.TallaComoVariable(nfilas, mat, matrizdos, matFila, talla38);
								plu.TallaComoVariable(nfilas, mat, matrizdos, matFila, talla40);

							} else {
								mat = matrizdos[p][q];
							}
						}
					}

					for (int k = 0; k < nfilas; k++) {
						for (int j = 0; j < 2; j++) {

							if (matrizdos[k][1] != null && (matrizdos[k][j]).toString().contains("SM")
									| (matrizdos[k][j]).toString().contains("LM")
									| (matrizdos[k][j]).toString().contains("LXL")) {

								plu.TallaComoVariable(nfilas, mat, matrizdos, matFila, tallaSM);
								plu.TallaComoVariable(nfilas, mat, matrizdos, matFila, tallaML);
								plu.TallaComoVariable(nfilas, mat, matrizdos, matFila, tallaLXL);

							} else {
								mat = matrizdos[p][q];
							}
						}
					}

					for (int k = 0; k < nfilas; k++) {
						for (int j = 0; j < 2; j++) {

							if (matrizdos[k][1] != null && (matrizdos[k][j]).toString().charAt(1) == 'U') {

								plu.TallaComoVariableChar(nfilas, mat, matrizdos, matFila, tallacharU);

							} else {
								mat = matrizdos[p][q];
							}
						}
					}

					for (int k = 0; k < nfilas; k++) {
						for (int j = 0; j < ncol; j++) {

							if (matriztabla[k][2] != null && (matriztabla[k][j]).toString().contains(exterior)
									| (matriztabla[k][j]).toString().contains(interior)
									| (matriztabla[k][j]).toString().contains(ropadeportiva)
									| (matriztabla[k][j]).toString().contains(ropadormir)
									| (matriztabla[k][j]).toString().contains(ropaplaya)
									| (matriztabla[k][j]).toString().contains(fragancias)
									| (matriztabla[k][j]).toString().contains(joyeria)
									| (matriztabla[k][j]).toString().contains(ofertas)
									| (matriztabla[k][j]).toString().contains(multicategoria)
									| (matriztabla[k][j]).toString().contains(multicategorias)
									| (matriztabla[k][j]).toString().contains(maquillaje)
									| (matriztabla[k][j]).toString().contains(cuidadopersonal)
									| (matriztabla[k][j]).toString().contains(paquetePacifika)
									| (matriztabla[k][j]).toString().contains(paqueteCarmel)
									| (matriztabla[k][j]).toString().contains(paqueteLoguin)
									| (matriztabla[k][j]).toString().contains(paqueteYerbabuena)
									| (matriztabla[k][j]).toString().contains(proteccion)
									| (matriztabla[k][j]).toString().contains(accesoriosProteccion)
									| (matriztabla[k][j]).toString().contains(deportivoProteccion)) {

								plu.Categoria(nfilas, ncol, matriztabla, exteriorProteccion, "5020");
								plu.Categoria(nfilas, ncol, matriztabla, accesoriosProteccion, "5018");
								plu.Categoria(nfilas, ncol, matriztabla, deportivoProteccion, "5019");
								plu.Categoria(nfilas, ncol, matriztabla, exterior, "5000");
								plu.Categoria(nfilas, ncol, matriztabla, interior, "5001");
								plu.Categoria(nfilas, ncol, matriztabla, ropadeportiva, "5003");
								plu.Categoria(nfilas, ncol, matriztabla, ropadormir, "5004");
								plu.Categoria(nfilas, ncol, matriztabla, ropaplaya, "5005");
								plu.Categoria(nfilas, ncol, matriztabla, fragancias, "5006");
								plu.Categoria(nfilas, ncol, matriztabla, joyeria, "5007");
								plu.Categoria(nfilas, ncol, matriztabla, cuidadopersonal, "5008");
								plu.Categoria(nfilas, ncol, matriztabla, maquillaje, "5009");
								plu.Categoria(nfilas, ncol, matriztabla, ofertas, "5010");
								plu.Categoria(nfilas, ncol, matriztabla, multicategoria, "5010");
								plu.Categoria(nfilas, ncol, matriztabla, multicategorias, "5010");
								plu.Categoria(nfilas, ncol, matriztabla, paqueteCarmel, "5011");
								plu.Categoria(nfilas, ncol, matriztabla, paquetePacifika, "5012");
								plu.Categoria(nfilas, ncol, matriztabla, paqueteLoguin, "5013");
								plu.Categoria(nfilas, ncol, matriztabla, paqueteYerbabuena, "5014");

							}

						}
					}

				}

			}

			Object fin, categ;

			for (int i = 0; i < nfilas; i++) {
				MarcasUMMPLUS.numero += 1;
				jTable1.setValueAt(MarcasUMMPLUS.numero, i, 6);
				for (int j = 0; j < ncol; j++) {

					fin = matFila[i][0];
					jTable1.setValueAt(fin, i, 3);
					jTable1.setValueAt(MarcasUMMPLUS.marca, i, 5);
					categ = matriztabla[i][2];

					jTable1.setValueAt(categ, i, 2);
				}
			}
		} else {
			if (BtnEjecutar.isSelected() == false && cont2 == 1) {
				JOptionPane.showMessageDialog(this, "ya se genero numero PLUS");
			}

		}

	}// GEN-LAST:event_BtnEjecutarActionPerformed

	int cont = 0;

	private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnImportarActionPerformed

		if (btnImportar.isSelected() == false && cont == 0) {
			cont = 1;
			jTable3.setVisible(false);
			try {

				archivo = new File(ruta + "//archivo.txt");
				leer = new FileReader(archivo);
				buferleer = new BufferedReader(leer);

				String campo = buferleer.readLine().trim();
				String[] Dato = campo.split(",");
				modelo = (DefaultTableModel) jTable1.getModel();
				modelo2 = (DefaultTableModel) jTable3.getModel();
				modelo.setColumnIdentifiers(Dato);

				Object[] filasTabla = buferleer.lines().toArray();

				for (int i = 0; i < filasTabla.length; i++) {

					String filas = filasTabla[i].toString().trim();
					String[] DatoFila = filas.split("/");
					modelo.addRow(DatoFila);

					modelo2.addRow(DatoFila);

				}
				// aqui es el cambio

				for (int i = 0; i < filasTabla.length; i++) {

					String filas = filasTabla[i].toString().trim();
					String[] DatoFila = filas.split("/");
					modelo2.addRow(DatoFila);
				}
				for (int i = 0; i < filasTabla.length; i++) {

					String filas = filasTabla[i].toString().trim();
					String[] DatoFila = filas.split("/");
					modelo2.addRow(DatoFila);

				}

			} catch (IOException e) {
			} finally {
				try {
					if (null != leer) {
						leer.close();
					}
				} catch (IOException e2) {
				}

			}
		} else {
			if (btnImportar.isSelected() == false && cont == 1) {
				JOptionPane.showMessageDialog(this, "el archivo ya se encuentra cargado");
			}

		}

		nfilas = jTable1.getRowCount();
		ncol = jTable1.getColumnCount();

	}// GEN-LAST:event_btnImportarActionPerformed

	@SuppressWarnings("deprecation")
	private void BtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BtnAtrasActionPerformed
		MarcasUMMPLUS umm = new MarcasUMMPLUS();
		umm.show();
		dispose();

	}// GEN-LAST:event_BtnAtrasActionPerformed

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

		jTable3.setVisible(true);
		Object categ, vmsap, vmorg, desc, marca, numplu, marcaB, marcaC;

		marca = jTable1.getValueAt(1, 5);

		marcaB = OrgPLUS.MarcaB(nfilas, marca);
		marcaC = OrgPLUS.MarcaC(nfilas, marca);

		for (int i = 0; i < nfilas; i++) {
			for (int j = 0; j < 7; j++) {

				jTable3.setValueAt(null, i, 3);
				jTable3.setValueAt(null, i, 5);
				jTable3.setValueAt(null, i, 6);
				categ = jTable1.getValueAt(i, 2);
				jTable3.setValueAt(categ, i, 1);
				vmsap = jTable1.getValueAt(i, 3);
				jTable3.setValueAt(vmsap, i, 28);
				vmorg = jTable1.getValueAt(i, 3);
				jTable3.setValueAt(vmorg, i, 38);
				desc = jTable1.getValueAt(i, 4);
				jTable3.setValueAt(desc, i, 13);
				marca = jTable1.getValueAt(i, 5);
				jTable3.setValueAt(marca, i, 29);
				jTable3.setValueAt(marca, i, 39);
				numplu = jTable1.getValueAt(i, 6);
				jTable3.setValueAt(numplu, i, 35);
				jTable3.setValueAt("UN", i, 2);
				jTable3.setValueAt("KG", i, 4);
				jTable3.setValueAt("M", i, 12);
				jTable3.setValueAt("UN", i, 14);
				jTable3.setValueAt("1", i, 15);
				jTable3.setValueAt("1", i, 16);
				jTable3.setValueAt("M", i, 22);
				jTable3.setValueAt("KG", i, 26);
				jTable3.setValueAt("UN", i, 33);
				jTable3.setValueAt("ZL", i, 36);

				jTable3.setValueAt(null, i + nfilas, 3);
				jTable3.setValueAt(null, i + nfilas, 5);
				jTable3.setValueAt(null, i + nfilas, 6);
				jTable3.setValueAt(categ, i + nfilas, 1);
				jTable3.setValueAt(vmsap, i + nfilas, 28);
				jTable3.setValueAt(vmorg, i + nfilas, 38);
				jTable3.setValueAt(desc, i + nfilas, 13);
				jTable3.setValueAt(marcaB, i + nfilas, 29);
				jTable3.setValueAt(marcaB, i + nfilas, 39);
				jTable3.setValueAt(numplu, i + nfilas, 35);
				jTable3.setValueAt("UN", i + nfilas, 2);
				jTable3.setValueAt("KG", i + nfilas, 4);
				jTable3.setValueAt("M", i + nfilas, 12);
				jTable3.setValueAt("UN", i + nfilas, 14);
				jTable3.setValueAt("1", i + nfilas, 15);
				jTable3.setValueAt("1", i + nfilas, 16);
				jTable3.setValueAt("M", i + nfilas, 22);
				jTable3.setValueAt("KG", i + nfilas, 26);
				jTable3.setValueAt("UN", i + nfilas, 33);
				jTable3.setValueAt("ZL", i + nfilas, 36);

				jTable3.setValueAt(null, i + nfilas * 2, 3);
				jTable3.setValueAt(null, i + nfilas * 2, 5);
				jTable3.setValueAt(null, i + nfilas * 2, 6);
				jTable3.setValueAt(categ, i + nfilas * 2, 1);
				jTable3.setValueAt(vmsap, i + nfilas * 2, 28);
				jTable3.setValueAt(vmorg, i + nfilas * 2, 38);
				jTable3.setValueAt(desc, i + nfilas * 2, 13);
				jTable3.setValueAt(marcaC, i + nfilas * 2, 29);
				jTable3.setValueAt(marcaC, i + nfilas * 2, 39);
				jTable3.setValueAt(numplu, i + nfilas * 2, 35);
				jTable3.setValueAt("UN", i + nfilas * 2, 2);
				jTable3.setValueAt("KG", i + nfilas * 2, 4);
				jTable3.setValueAt("M", i + nfilas * 2, 12);
				jTable3.setValueAt("UN", i + nfilas * 2, 14);
				jTable3.setValueAt("1", i + nfilas * 2, 15);
				jTable3.setValueAt("1", i + nfilas * 2, 16);
				jTable3.setValueAt("M", i + nfilas * 2, 22);
				jTable3.setValueAt("KG", i + nfilas * 2, 26);
				jTable3.setValueAt("UN", i + nfilas * 2, 33);
				jTable3.setValueAt("ZL", i + nfilas * 2, 36);

			}
		}

		// TableRowSorter<TableModel> Ordenar = new TableRowSorter
		// <TableModel>(modelo2);
		// jTable3.setRowSorter(Ordenar);

	}// GEN-LAST:event_jButton1ActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(plantilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(plantilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(plantilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(plantilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {

			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton BtnAtras;
	public javax.swing.JButton BtnEjecutar;
	private javax.swing.JLabel LblTablaBase;
	private javax.swing.JLabel LblTituloPrincipal;
	public javax.swing.JButton btnImportar;
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane4;
	public javax.swing.JTable jTable1;
	private javax.swing.JTable jTable2;
	private javax.swing.JTable jTable3;
}
