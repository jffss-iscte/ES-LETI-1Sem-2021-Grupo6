package ES_LETI_1Sem_2021_Grupo6.projetoEs;


	import javax.swing.JFrame;
	import org.jfree.chart.ChartFactory;
	import org.jfree.chart.ChartPanel;
	import org.jfree.chart.JFreeChart;
	import org.jfree.chart.axis.CategoryAxis;
	import org.jfree.chart.axis.CategoryLabelPositions;
	import org.jfree.chart.plot.CategoryPlot;
	import org.jfree.chart.plot.PlotOrientation;
	import org.jfree.data.category.CategoryDataset;
	import org.jfree.data.category.DefaultCategoryDataset;
	import javax.swing.BorderFactory;
	import java.awt.Color;


	
	/**
	* Graph Results to compare obtained results.
	* 
	* 
	* @author jffss-iscte
	* 
	*/
	public class Graphs {
		
		
		
		
		public Graphs(int arr[]) {
			
		}
		
		/**
		 * <p>Creates the graphic for indicators comparing.
		 * </p>
		 * 
		 *
		 */
		
		public void createGraph() {

			JFrame graph=new JFrame();
			CategoryDataset dataset = createDataset();

			JFreeChart chart = createChart(dataset);
			ChartPanel chartPanel = new ChartPanel(chart);
			chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
			chartPanel.setBackground(Color.white);
			graph.add(chartPanel);

			graph.pack();
			graph.setTitle("Bar chart");
			graph.setLocationRelativeTo(null);
			//graph.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			graph.setSize(500, 500);
			graph.setVisible(true);
		}
		/**
		 * <p>Puts the right values into the graph.
		 * </p>
		 * 
		 *
		 */
		private CategoryDataset createDataset() {

			DefaultCategoryDataset dataset = new DefaultCategoryDataset();

//			dataset.setValue(dci_iP, "Number of Methods", "DCI(iPlasma)");
//			dataset.setValue(dii_iP, "Number of Methods", "DII(iPlasma)");
//			dataset.setValue(adci_iP, "Number of Methods", "ADCI(iPlasma)");
//			dataset.setValue(adii_iP, "Number of Methods", "ADII(iPlasma)");
//
//			dataset.setValue(dci_PMD, "Number of Methods", "DCI(PMD)");
//			dataset.setValue(dii_PMD, "Number of Methods", "DII(PMD)");
//			dataset.setValue(adci_PMD, "Number of Methods", "ADCI(PMD)");
//			dataset.setValue(adii_PMD, "Number of Methods", "ADII(PMD)");
//
//			dataset.setValue(dci_TH_LM, "Number of Methods", "DCI(TH Long Method)");
//			dataset.setValue(dii_TH_LM, "Number of Methods", "DII(TH Long Method)");
//			dataset.setValue(adci_TH_LM, "Number of Methods", "ADCI(TH Long Method)");
//			dataset.setValue(adii_TH_LM, "Number of Methods", "ADII(TH Long Method)");
//
//			dataset.setValue(dci_TH_FE, "Number of Methods", "DCI(TH feature envy)");
//			dataset.setValue(dii_TH_FE, "Number of Methods", "DII(TH feature envy)");
//			dataset.setValue(adci_TH_FE, "Number of Methods", "ADCI(TH feature envy)");
//			dataset.setValue(adii_TH_FE, "Number of Methods", "ADII(TH feature envy)");

			return dataset;
		}
		
		
		 /**
	     * Creates a chart.
	     *
	     * @param dataset  the dataset.
	     *
	     * @return The barChart.
	     */
		private JFreeChart createChart(CategoryDataset dataset) {

			JFreeChart barChart = ChartFactory.createBarChart(
					"Code Smells",
					"",
					"Number of Methods",
					dataset,
					PlotOrientation.VERTICAL,
					true, true, true);
			
			CategoryPlot plot = (CategoryPlot) barChart.getPlot();
			plot.setRangePannable(true);

			CategoryAxis domainAxis = plot.getDomainAxis();
			domainAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_90);

			return barChart;
		}
		

	}

