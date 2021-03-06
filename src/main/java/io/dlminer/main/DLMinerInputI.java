package io.dlminer.main;


import io.dlminer.learn.AxiomPattern;
import io.dlminer.ont.Logic;
import io.dlminer.ont.OntologyFormat;
import io.dlminer.ont.ReasonerLoader;
import io.dlminer.ont.ReasonerName;

/**
 * @author Slava Sazonau
 * The University of Manchester
 * Information Management Group
 * 
 * The interface contains default parameters of the DL-Miner algorithm
 * and error messages.
 */
public interface DLMinerInputI {
	
	// ====================== default parameters ======================
	
	/**
	 * Default maxRoleDepth
	 */
	Integer DEF_MAX_ROLE_DEPTH = 1;
	
	
	/**
	 * Default maxHypothesesNumber
	 */
	Integer DEF_MAX_HYPOTHESES_NUMBER = 100000;
	
	
	/**
	 * Default reasonerTimeout in seconds
	 */
	Integer DEF_REASONER_TIMEOUT = 6000;
	
	
	/**
	 * Default minPrecision
	 */
	Double DEF_MIN_PRECISION = 0.9;
	
	
	/**
	 * Default minConceptSupport
	 */
	Integer DEF_MIN_CONCEPT_SUPPORT = 10;
	
	
	
	/**
	 * Default beamSize
	 */
	Integer DEF_BEAM_SIZE = 100000;
	
	
	/**
	 * Default maxConceptLength
	 */
	Integer DEF_MAX_CONCEPT_LENGTH = 5;
	
	
	/**
	 * Default ontology format to store hypotheses
	 */
	OntologyFormat DEF_HYPOTHESIS_FORMAT = OntologyFormat.OWLXML;
	
	
	/**
	 * Default logic for hypotheses
	 */
	Logic DEF_LOGIC = Logic.EL;
	
	
	
	/**
	 * Default reasoner
	 */
	ReasonerName DEF_REASONER_NAME = ReasonerLoader.DEF_REASONER;
	
	

	/**
	 * Default flag for using minimal support
	 */
	Boolean DEF_USE_MIN_SUPPORT = true;
	
	
	/**
	 * Default flag for using disjointness
	 */
	Boolean DEF_USE_DISJOINTNESS = false;
	
	
	
	/**
	 * Default flag for using disjunction
	 */
	Boolean DEF_USE_DISJUNCTION = false;
	
	

	/**
	 * Default flag for using universal restriction
	 */
	Boolean DEF_USE_UNIVERSAL = false;



	/**
	 * Default flag for using negation
	 */
	Boolean DEF_USE_NEGATION = false;


	
	
	/**
	 * Default flag for using minimal precision
	 */
	Boolean DEF_USE_MIN_PRECISION = true;
	
	

	/**
	 * Default flag for using consistency
	 */
	Boolean DEF_USE_CONSISTENCY = false;
	
	
	

	/**
	 * Default mode the algorithm operates in
	 */
	DLMinerMode DEF_DLMINER_MODE = DLMinerMode.NORM;
	
	
	/**
	 * Default flag for using cleaning
	 */
	Boolean DEF_USE_CLEANING = false;
	
	
	/**
	 * Default flag for using the Closed World Assumption (CWA)
	 */
	Boolean DEF_USE_CWA = false;


    /**
     * Default flag for using data properties
     */
    Boolean DEF_USE_DATA_PROPERTIES = true;


    /**
     * Default number of thresholds for data properties
     */
    Integer DEF_DATA_THRESHOLDS_NUMBER = 100;


    /**
     * Default flag for using object property subsumptions
     */
    Boolean DEF_USE_OBJECT_PROPERTY_SUBSUMPTIONS = true;


    /**
     * Default flag for using inverse object properties
     */
    Boolean DEF_USE_INVERSE_OBJECT_PROPERTIES = false;


    /**
     * Default flag for using object property chains
     */
    Boolean DEF_USE_OBJECT_PROPERTY_CHAINS = false;



    /**
     * Default flag for using computationally complex measures
     */
    Boolean DEF_USE_COMPLEX_MEASURES = false;


    Boolean DEF_USE_REASONER_FOR_ATOMIC_CLASS_INSTANCES = true;

    Boolean DEF_USE_REASONER_FOR_CLASS_INSTANCES = false;

    Boolean DEF_USE_REDUNDANCY = true;

    Boolean DEF_STORE_INSTANCES = true;

    AxiomPattern DEF_AXIOM_PATTERN = AxiomPattern.SEEDS_RHS_LHS;

		
	
	// ====================== error messages ======================
	

	// wrong parameter value errors
	String WRONG_MAX_ROLE_DEPTH_ERR = "maxRoleDepth cannot be negative (can only be zero or positive)!";
	String WRONG_MAX_HYPOTHESES_NUMBER_ERR = "maxHypothesesNumber can only be positive!";
	String WRONG_REASONER_TIMEOUT_ERR = "reasonerTimeout can only be positive!";
	String WRONG_MIN_PRECISION_ERR = "minPrecision can only be positive!";
	String WRONG_MIN_CONCEPT_SUPPORT_ERR = "minConceptSupport cannot be negative!";




}
