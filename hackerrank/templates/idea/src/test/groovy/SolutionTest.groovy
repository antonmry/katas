import spock.lang.Specification

class SolutionTest extends Specification {

    String PATH = 'src/test/resources/'

    def "Test based in input and output files"() {

        setup:
        def outputBuffer = new ByteArrayOutputStream()
        System.out = new PrintStream(outputBuffer)
        InputStream input = new ByteArrayInputStream(new File(PATH+inputFile).text.getBytes())
        System.setIn(input)

        when:
        Solution.main()

        then:
        outputBuffer.toString() + '\n' == new File(PATH+outputFile).text

        where:
        inputFile     | outputFile
        'input00.txt' | 'output00.txt'
    }
}
