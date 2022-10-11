/**
 * generated by Xtext 2.28.0
 */
package fr.n7.pDL3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Work Sequence Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.n7.pDL3.PDL3Package#getWorkSequenceType()
 * @model
 * @generated
 */
public enum WorkSequenceType implements Enumerator
{
  /**
   * The '<em><b>Start To Start</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #START_TO_START_VALUE
   * @generated
   * @ordered
   */
  START_TO_START(0, "startToStart", "s2s"),

  /**
   * The '<em><b>Finish To Finish</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FINISH_TO_FINISH_VALUE
   * @generated
   * @ordered
   */
  FINISH_TO_FINISH(1, "finishToFinish", "f2f"),

  /**
   * The '<em><b>Start To Finish</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #START_TO_FINISH_VALUE
   * @generated
   * @ordered
   */
  START_TO_FINISH(2, "startToFinish", "s2f"),

  /**
   * The '<em><b>Finish To Start</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FINISH_TO_START_VALUE
   * @generated
   * @ordered
   */
  FINISH_TO_START(3, "finishToStart", "f2s");

  /**
   * The '<em><b>Start To Start</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #START_TO_START
   * @model name="startToStart" literal="s2s"
   * @generated
   * @ordered
   */
  public static final int START_TO_START_VALUE = 0;

  /**
   * The '<em><b>Finish To Finish</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FINISH_TO_FINISH
   * @model name="finishToFinish" literal="f2f"
   * @generated
   * @ordered
   */
  public static final int FINISH_TO_FINISH_VALUE = 1;

  /**
   * The '<em><b>Start To Finish</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #START_TO_FINISH
   * @model name="startToFinish" literal="s2f"
   * @generated
   * @ordered
   */
  public static final int START_TO_FINISH_VALUE = 2;

  /**
   * The '<em><b>Finish To Start</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FINISH_TO_START
   * @model name="finishToStart" literal="f2s"
   * @generated
   * @ordered
   */
  public static final int FINISH_TO_START_VALUE = 3;

  /**
   * An array of all the '<em><b>Work Sequence Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final WorkSequenceType[] VALUES_ARRAY =
    new WorkSequenceType[]
    {
      START_TO_START,
      FINISH_TO_FINISH,
      START_TO_FINISH,
      FINISH_TO_START,
    };

  /**
   * A public read-only list of all the '<em><b>Work Sequence Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<WorkSequenceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Work Sequence Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static WorkSequenceType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      WorkSequenceType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Work Sequence Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static WorkSequenceType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      WorkSequenceType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Work Sequence Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static WorkSequenceType get(int value)
  {
    switch (value)
    {
      case START_TO_START_VALUE: return START_TO_START;
      case FINISH_TO_FINISH_VALUE: return FINISH_TO_FINISH;
      case START_TO_FINISH_VALUE: return START_TO_FINISH;
      case FINISH_TO_START_VALUE: return FINISH_TO_START;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private WorkSequenceType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //WorkSequenceType
