/*
 * generated by Xtext 2.28.0
 */
package fr.n7.simplepdl.txt.serializer;

import com.google.inject.Inject;
import fr.n7.simplepdl.txt.services.PDLGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import simplepdl.AskedRessource;
import simplepdl.Guidance;
import simplepdl.ProcessElement;
import simplepdl.Ressource;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;

@SuppressWarnings("all")
public class PDLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PDLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SimplepdlPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SimplepdlPackage.ASKED_RESSOURCE:
				sequence_AskedRessource(context, (AskedRessource) semanticObject); 
				return; 
			case SimplepdlPackage.GUIDANCE:
				sequence_Guidance(context, (Guidance) semanticObject); 
				return; 
			case SimplepdlPackage.PROCESS:
				sequence_Process(context, (simplepdl.Process) semanticObject); 
				return; 
			case SimplepdlPackage.PROCESS_ELEMENT:
				sequence_ProcessElement_Impl(context, (ProcessElement) semanticObject); 
				return; 
			case SimplepdlPackage.RESSOURCE:
				sequence_Ressource(context, (Ressource) semanticObject); 
				return; 
			case SimplepdlPackage.WORK_DEFINITION:
				sequence_WorkDefinition(context, (WorkDefinition) semanticObject); 
				return; 
			case SimplepdlPackage.WORK_SEQUENCE:
				sequence_WorkSequence(context, (WorkSequence) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProcessElement returns AskedRessource
	 *     AskedRessource returns AskedRessource
	 *
	 * Constraint:
	 *     (quantity=EInt ressource=[Ressource|EString])
	 * </pre>
	 */
	protected void sequence_AskedRessource(ISerializationContext context, AskedRessource semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimplepdlPackage.Literals.ASKED_RESSOURCE__QUANTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplepdlPackage.Literals.ASKED_RESSOURCE__QUANTITY));
			if (transientValues.isValueTransient(semanticObject, SimplepdlPackage.Literals.ASKED_RESSOURCE__RESSOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplepdlPackage.Literals.ASKED_RESSOURCE__RESSOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAskedRessourceAccess().getQuantityEIntParserRuleCall_3_0(), semanticObject.getQuantity());
		feeder.accept(grammarAccess.getAskedRessourceAccess().getRessourceRessourceEStringParserRuleCall_5_0_1(), semanticObject.eGet(SimplepdlPackage.Literals.ASKED_RESSOURCE__RESSOURCE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProcessElement returns Guidance
	 *     Guidance returns Guidance
	 *
	 * Constraint:
	 *     (text=EString (elements+=[ProcessElement|EString] elements+=[ProcessElement|EString]*)?)
	 * </pre>
	 */
	protected void sequence_Guidance(ISerializationContext context, Guidance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProcessElement returns ProcessElement
	 *     ProcessElement_Impl returns ProcessElement
	 *
	 * Constraint:
	 *     {ProcessElement}
	 * </pre>
	 */
	protected void sequence_ProcessElement_Impl(ISerializationContext context, ProcessElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Process returns Process
	 *
	 * Constraint:
	 *     (name=EString processElements+=ProcessElement*)
	 * </pre>
	 */
	protected void sequence_Process(ISerializationContext context, simplepdl.Process semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProcessElement returns Ressource
	 *     Ressource returns Ressource
	 *
	 * Constraint:
	 *     (name=EString stock=EInt (work+=[AskedRessource|EString] work+=[AskedRessource|EString]*)?)
	 * </pre>
	 */
	protected void sequence_Ressource(ISerializationContext context, Ressource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProcessElement returns WorkDefinition
	 *     WorkDefinition returns WorkDefinition
	 *
	 * Constraint:
	 *     name=EString
	 * </pre>
	 */
	protected void sequence_WorkDefinition(ISerializationContext context, WorkDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimplepdlPackage.Literals.WORK_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplepdlPackage.Literals.WORK_DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWorkDefinitionAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProcessElement returns WorkSequence
	 *     WorkSequence returns WorkSequence
	 *
	 * Constraint:
	 *     (linkType=WorkSequenceType predecessor=[WorkDefinition|ID] successor=[WorkDefinition|ID])
	 * </pre>
	 */
	protected void sequence_WorkSequence(ISerializationContext context, WorkSequence semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimplepdlPackage.Literals.WORK_SEQUENCE__LINK_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplepdlPackage.Literals.WORK_SEQUENCE__LINK_TYPE));
			if (transientValues.isValueTransient(semanticObject, SimplepdlPackage.Literals.WORK_SEQUENCE__PREDECESSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplepdlPackage.Literals.WORK_SEQUENCE__PREDECESSOR));
			if (transientValues.isValueTransient(semanticObject, SimplepdlPackage.Literals.WORK_SEQUENCE__SUCCESSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplepdlPackage.Literals.WORK_SEQUENCE__SUCCESSOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0(), semanticObject.getLinkType());
		feeder.accept(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1(), semanticObject.eGet(SimplepdlPackage.Literals.WORK_SEQUENCE__PREDECESSOR, false));
		feeder.accept(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1(), semanticObject.eGet(SimplepdlPackage.Literals.WORK_SEQUENCE__SUCCESSOR, false));
		feeder.finish();
	}
	
	
}
