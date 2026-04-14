import control.CircularLinkedList;
import model.Contact;


public class Main {
    public final static int N = 100_000;
    static long durationNanoSecs = 1_000_000_000;
    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();
        long start = System.nanoTime();
        list.add(new Contact("juan1", "600001"));
        list.add(new Contact("maria2", "600002"));
        list.add(new Contact("carlos3", "600003"));
        list.add(new Contact("ana4", "600004"));
        list.add(new Contact("luis5", "600005"));
        list.add(new Contact("sofia6", "600006"));
        list.add(new Contact("diego7", "600007"));
        list.add(new Contact("laura8", "600008"));
        list.add(new Contact("pedro9", "600009"));
        list.add(new Contact("pepita10", "600010"));

        list.add(new Contact("juan11", "600011"));
        list.add(new Contact("maria12", "600012"));
        list.add(new Contact("carlos13", "600013"));
        list.add(new Contact("ana14", "600014"));
        list.add(new Contact("luis15", "600015"));
        list.add(new Contact("sofia16", "600016"));
        list.add(new Contact("diego17", "600017"));
        list.add(new Contact("laura18", "600018"));
        list.add(new Contact("pedro19", "600019"));
        list.add(new Contact("pepita20", "600020"));

        list.add(new Contact("juan21", "600021"));
        list.add(new Contact("maria22", "600022"));
        list.add(new Contact("carlos23", "600023"));
        list.add(new Contact("ana24", "600024"));
        list.add(new Contact("luis25", "600025"));
        list.add(new Contact("sofia26", "600026"));
        list.add(new Contact("diego27", "600027"));
        list.add(new Contact("laura28", "600028"));
        list.add(new Contact("pedro29", "600029"));
        list.add(new Contact("pepita30", "600030"));

        list.add(new Contact("juan31", "600031"));
        list.add(new Contact("maria32", "600032"));
        list.add(new Contact("carlos33", "600033"));
        list.add(new Contact("ana34", "600034"));
        list.add(new Contact("luis35", "600035"));
        list.add(new Contact("sofia36", "600036"));
        list.add(new Contact("diego37", "600037"));
        list.add(new Contact("laura38", "600038"));
        list.add(new Contact("pedro39", "600039"));
        list.add(new Contact("pepita40", "600040"));

        list.add(new Contact("juan41", "600041"));
        list.add(new Contact("maria42", "600042"));
        list.add(new Contact("carlos43", "600043"));
        list.add(new Contact("ana44", "600044"));
        list.add(new Contact("luis45", "600045"));
        list.add(new Contact("sofia46", "600046"));
        list.add(new Contact("diego47", "600047"));
        list.add(new Contact("laura48", "600048"));
        list.add(new Contact("pedro49", "600049"));
        list.add(new Contact("pepita50", "600050"));

        list.add(new Contact("juan51", "600051"));
        list.add(new Contact("maria52", "600052"));
        list.add(new Contact("carlos53", "600053"));
        list.add(new Contact("ana54", "600054"));
        list.add(new Contact("luis55", "600055"));
        list.add(new Contact("sofia56", "600056"));
        list.add(new Contact("diego57", "600057"));
        list.add(new Contact("laura58", "600058"));
        list.add(new Contact("pedro59", "600059"));
        list.add(new Contact("pepita60", "600060"));

        list.add(new Contact("juan61", "600061"));
        list.add(new Contact("maria62", "600062"));
        list.add(new Contact("carlos63", "600063"));
        list.add(new Contact("ana64", "600064"));
        list.add(new Contact("luis65", "600065"));
        list.add(new Contact("sofia66", "600066"));
        list.add(new Contact("diego67", "600067"));
        list.add(new Contact("laura68", "600068"));
        list.add(new Contact("pedro69", "600069"));
        list.add(new Contact("pepita70", "600070"));

        list.add(new Contact("juan71", "600071"));
        list.add(new Contact("maria72", "600072"));
        list.add(new Contact("carlos73", "600073"));
        list.add(new Contact("ana74", "600074"));
        list.add(new Contact("luis75", "600075"));
        list.add(new Contact("sofia76", "600076"));
        list.add(new Contact("diego77", "600077"));
        list.add(new Contact("laura78", "600078"));
        list.add(new Contact("pedro79", "600079"));
        list.add(new Contact("pepita80", "600080"));

        list.add(new Contact("juan81", "600081"));
        list.add(new Contact("maria82", "600082"));
        list.add(new Contact("carlos83", "600083"));
        list.add(new Contact("ana84", "600084"));
        list.add(new Contact("luis85", "600085"));
        list.add(new Contact("sofia86", "600086"));
        list.add(new Contact("diego87", "600087"));
        list.add(new Contact("laura88", "600088"));
        list.add(new Contact("pedro89", "600089"));
        list.add(new Contact("pepita90", "600090"));

        list.add(new Contact("juan91", "600091"));
        list.add(new Contact("maria92", "600092"));
        list.add(new Contact("carlos93", "600093"));
        list.add(new Contact("ana94", "600094"));
        list.add(new Contact("luis95", "600095"));
        list.add(new Contact("sofia96", "600096"));
        list.add(new Contact("diego97", "600097"));
        list.add(new Contact("laura98", "600098"));
        list.add(new Contact("pedro99", "600099"));
        list.add(new Contact("pepita100", "600100"));

        list.add(new Contact("juan101", "600101"));
        list.add(new Contact("maria102", "600102"));
        list.add(new Contact("carlos103", "600103"));
        list.add(new Contact("ana104", "600104"));
        list.add(new Contact("luis105", "600105"));
        list.add(new Contact("sofia106", "600106"));
        list.add(new Contact("diego107", "600107"));
        list.add(new Contact("laura108", "600108"));
        list.add(new Contact("pedro109", "600109"));
        list.add(new Contact("pepita110", "600110"));

        list.add(new Contact("juan111", "600111"));
        list.add(new Contact("maria112", "600112"));
        list.add(new Contact("carlos113", "600113"));
        list.add(new Contact("ana114", "600114"));
        list.add(new Contact("luis115", "600115"));
        list.add(new Contact("sofia116", "600116"));
        list.add(new Contact("diego117", "600117"));
        list.add(new Contact("laura118", "600118"));
        list.add(new Contact("pedro119", "600119"));
        list.add(new Contact("pepita120", "600120"));

        list.add(new Contact("juan121", "600121"));
        list.add(new Contact("maria122", "600122"));
        list.add(new Contact("carlos123", "600123"));
        list.add(new Contact("ana124", "600124"));
        list.add(new Contact("luis125", "600125"));
        list.add(new Contact("sofia126", "600126"));
        list.add(new Contact("diego127", "600127"));
        list.add(new Contact("laura128", "600128"));
        list.add(new Contact("pedro129", "600129"));
        list.add(new Contact("pepita130", "600130"));

        list.add(new Contact("juan131", "600131"));
        list.add(new Contact("maria132", "600132"));
        list.add(new Contact("carlos133", "600133"));
        list.add(new Contact("ana134", "600134"));
        list.add(new Contact("luis135", "600135"));
        list.add(new Contact("sofia136", "600136"));
        list.add(new Contact("diego137", "600137"));
        list.add(new Contact("laura138", "600138"));
        list.add(new Contact("pedro139", "600139"));
        list.add(new Contact("pepita140", "600140"));

        list.add(new Contact("juan141", "600141"));
        list.add(new Contact("maria142", "600142"));
        list.add(new Contact("carlos143", "600143"));
        list.add(new Contact("ana144", "600144"));
        list.add(new Contact("luis145", "600145"));
        list.add(new Contact("sofia146", "600146"));
        list.add(new Contact("diego147", "600147"));
        list.add(new Contact("laura148", "600148"));
        list.add(new Contact("pedro149", "600149"));
        list.add(new Contact("pepita150", "600150"));

        list.add(new Contact("juan151", "600151"));
        list.add(new Contact("maria152", "600152"));
        list.add(new Contact("carlos153", "600153"));
        list.add(new Contact("ana154", "600154"));
        list.add(new Contact("luis155", "600155"));
        list.add(new Contact("sofia156", "600156"));
        list.add(new Contact("diego157", "600157"));
        list.add(new Contact("laura158", "600158"));
        list.add(new Contact("pedro159", "600159"));
        list.add(new Contact("pepita160", "600160"));

        list.add(new Contact("juan161", "600161"));
        list.add(new Contact("maria162", "600162"));
        list.add(new Contact("carlos163", "600163"));
        list.add(new Contact("ana164", "600164"));
        list.add(new Contact("luis165", "600165"));
        list.add(new Contact("sofia166", "600166"));
        list.add(new Contact("diego167", "600167"));
        list.add(new Contact("laura168", "600168"));
        list.add(new Contact("pedro169", "600169"));
        list.add(new Contact("pepita170", "600170"));

        list.add(new Contact("juan171", "600171"));
        list.add(new Contact("maria172", "600172"));
        list.add(new Contact("carlos173", "600173"));
        list.add(new Contact("ana174", "600174"));
        list.add(new Contact("luis175", "600175"));
        list.add(new Contact("sofia176", "600176"));
        list.add(new Contact("diego177", "600177"));
        list.add(new Contact("laura178", "600178"));
        list.add(new Contact("pedro179", "600179"));
        list.add(new Contact("pepita180", "600180"));

        list.add(new Contact("juan181", "600181"));
        list.add(new Contact("maria182", "600182"));
        list.add(new Contact("carlos183", "600183"));
        list.add(new Contact("ana184", "600184"));
        list.add(new Contact("luis185", "600185"));
        list.add(new Contact("sofia186", "600186"));
        list.add(new Contact("diego187", "600187"));
        list.add(new Contact("laura188", "600188"));
        list.add(new Contact("pedro189", "600189"));
        list.add(new Contact("pepita190", "600190"));

        list.add(new Contact("juan191", "600191"));
        list.add(new Contact("maria192", "600192"));
        list.add(new Contact("carlos193", "600193"));
        list.add(new Contact("ana194", "600194"));
        list.add(new Contact("luis195", "600195"));
        list.add(new Contact("sofia196", "600196"));
        list.add(new Contact("diego197", "600197"));
        list.add(new Contact("laura198", "600198"));
        list.add(new Contact("pedro199", "600199"));
        list.add(new Contact("pepita200", "600200"));

        for (int i =0; i<Main.N; i++){
            list.add(new Contact("nombre"+i, "666"+i));
        }

        long end = System.nanoTime();
        System.out.println("Tamaño: " + list.getSize());

        System.out.println("Lista inicial");
        System.out.println("tamaño: " + list.getSize());
        list.listAll();

        start = System.nanoTime();

        System.out.println("\nBuscar pelota: ");
        System.out.println(list.finsByName("pelota"));

        end = System.nanoTime();
        System.out.println((double) (end - start) - durationNanoSecs);

        start = System.nanoTime();
        System.out.println("\neliminar pelota");
        list.deleteByName("pelota");

        end = System.nanoTime();
        System.out.println((double) (end - start) - durationNanoSecs);

        System.out.println("\nlista final");
        System.out.println("tamaño: " + list.getSize());
        list.listAll();
    }
}