/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package rules;

/**
 * RulesOf6005 represents the collaboration policy of 6.005 as described by the
 * general information on Stellar.
 */
public class RulesOf6005 {
     
    /**
     * Judge whether a given piece of code may be used in an assignment (problem
     * set or team project) or not, according to the 6.005 collaboration policy.
     * 
     * @param writtenByYourself true if the code in question was written by
     *        yourself or, in the case of a team project, your teammates,
     *        otherwise false.
     *        ��������۵Ĵ����������Լ���д�ģ��������Ŷ���Ŀ��������Ķ��ѱ�д�ģ�
     *        ��Ϊtrue������Ϊfalse��
     * @param availableToOthers if not writtenByYourself, whether or not the
     *        code in question is available to all other students in the class.
     *        Otherwise ignored.
     *        ������ύ�Ĵ��벻�����Լ�д��(writtenByYourself == false)��
     *        ��ô�������Ƿ���һ����Ҷ��ܻ�ȡ���Ĺ�����Դ��
     *        ϵͳ�����󶼻�����δ����Ƿ���Ϲ涨��
     * @param writtenAsCourseWork if not writtenByYourself, whether or not the
     *        code in question was written specifically as part of a solution to
     *        a 6.005 assignment, in the current or past semesters. Otherwise
     *        ignored.
     *        ������ύ�Ĵ��벻�����Լ�д��(writtenByYourself == false)��
     *        ��ô������δ�����ĳ��ѧ�ڵ� 6.005 �γ���ҵ��һ���ֻ������������ط���
     *        ���ᱻ����Ƿ���Ϲ涨��
     * @param citingYourSource if not writtenByYourself, whether or not you
     *        properly cite your source. Otherwise ignored.
     *        ������벻����д��(writtenByYourself == false)����ʹ����ע����Դ��
     *        ϵͳ��������Ȼ����˴����Ƿ���Ϲ涨��
     * @param implementationRequired whether the assignment specifically asks
     *        you to implement the feature in question.
     *        ����ҵ�Ƿ���ȷҪ����ʵ����ع���
     * @return Whether or not, based on the information provided in the
     *         arguments, you are likely to be allowed to use the code in
     *         question in your assignment, according to the 6.005 collaboration
     *         policy for the current semester.
     *         �������ṩ�Ĳ�����Ϣ�����ݱ�ѧ�� 6.005 �γ̵�Э�����ߣ�
     *         ���Ƿ���������ҵ��ʹ����δ��롣
     */
    public static boolean mayUseCodeInAssignment(boolean writtenByYourself,
            boolean availableToOthers, boolean writtenAsCourseWork,
            boolean citingYourSource, boolean implementationRequired) {
        
        // TODO: Fill in this method, then remove the exception
        
        if(writtenByYourself == true) {
            if(implementationRequired == true) {
                return true;
            }else {
                return false;
            }
        }else if (availableToOthers == true && writtenAsCourseWork == true && citingYourSource == true && implementationRequired == true) {
            return true;
        }else {
            return false;
        }
          
        
//        throw new RuntimeException("implement me!");
    }
    
    /**
     * Main method of the class.
     * 
     * Runs the mayUseCodeInAssignment method.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        System.out.println("You may certainly use code you wrote yourself: " +
            RulesOf6005.mayUseCodeInAssignment(true, false, true, true, true));
    }
}
