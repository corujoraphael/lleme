package uff.ic.letstalk.corbaObjects.scs;

/**
 * corbaObjects/scs/_ComponentLoaderStub.java . Generated by the IDL-to-Java
 * compiler (portable), version "3.2" from deployment.idl Sexta-feira, 9 de
 * Dezembro de 2005 18h26min28s BRST
 */
public class _ComponentLoaderStub extends org.omg.CORBA.portable.ObjectImpl
        implements uff.ic.letstalk.corbaObjects.scs.ComponentLoader {

    public uff.ic.letstalk.corbaObjects.scs.ComponentHandle load(
            uff.ic.letstalk.corbaObjects.scs.ComponentId id, String[] args)
            throws uff.ic.letstalk.corbaObjects.scs.ComponentNotFound,
            uff.ic.letstalk.corbaObjects.scs.ComponentAlreadyLoaded,
            uff.ic.letstalk.corbaObjects.scs.LoadFailure {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("load", true);
            uff.ic.letstalk.corbaObjects.scs.ComponentIdHelper.write($out, id);
            uff.ic.letstalk.corbaObjects.scs.StringSeqHelper.write($out, args);
            $in = _invoke($out);
            uff.ic.letstalk.corbaObjects.scs.ComponentHandle $result = uff.ic.letstalk.corbaObjects.scs.ComponentHandleHelper
                    .read($in);
            return $result;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            if (_id.equals("IDL:corbaObjects/scs/ComponentNotFound:1.0"))
                throw uff.ic.letstalk.corbaObjects.scs.ComponentNotFoundHelper.read($in);
            else if (_id
                    .equals("IDL:corbaObjects/scs/ComponentAlreadyLoaded:1.0"))
                throw uff.ic.letstalk.corbaObjects.scs.ComponentAlreadyLoadedHelper.read($in);
            else if (_id.equals("IDL:corbaObjects/scs/LoadFailure:1.0"))
                throw uff.ic.letstalk.corbaObjects.scs.LoadFailureHelper.read($in);
            else
                throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            return load(id, args);
        } finally {
            _releaseReply($in);
        }
    } // load

    public void unload(uff.ic.letstalk.corbaObjects.scs.ComponentHandle handle)
            throws uff.ic.letstalk.corbaObjects.scs.ComponentNotFound {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("unload", true);
            uff.ic.letstalk.corbaObjects.scs.ComponentHandleHelper.write($out, handle);
            $in = _invoke($out);
            return;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            if (_id.equals("IDL:corbaObjects/scs/ComponentNotFound:1.0"))
                throw uff.ic.letstalk.corbaObjects.scs.ComponentNotFoundHelper.read($in);
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            unload(handle);
        } finally {
            _releaseReply($in);
        }
    } // unload

    public uff.ic.letstalk.corbaObjects.scs.ComponentHandle[] getLoadedComponents() {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request(
                    "getLoadedComponents", true);
            $in = _invoke($out);
            uff.ic.letstalk.corbaObjects.scs.ComponentHandle $result[] = uff.ic.letstalk.corbaObjects.scs.ComponentHandleSeqHelper
                    .read($in);
            return $result;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            return getLoadedComponents();
        } finally {
            _releaseReply($in);
        }
    } // getLoadedComponents

    public uff.ic.letstalk.corbaObjects.scs.ComponentId[] getInstalledComponents() {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request(
                    "getInstalledComponents", true);
            $in = _invoke($out);
            uff.ic.letstalk.corbaObjects.scs.ComponentId $result[] = uff.ic.letstalk.corbaObjects.scs.ComponentIdSeqHelper
                    .read($in);
            return $result;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            return getInstalledComponents();
        } finally {
            _releaseReply($in);
        }
    } // getInstalledComponents

    // Type-specific CORBA::Object operations
    private static String[] __ids = {"IDL:corbaObjects/scs/ComponentLoader:1.0"};

    public String[] _ids() {
        return __ids.clone();
    }

    private void readObject(java.io.ObjectInputStream s)
            throws java.io.IOException {
        String str = s.readUTF();
        String[] args = null;
        java.util.Properties props = null;
        org.omg.CORBA.Object obj = org.omg.CORBA.ORB.init(args, props)
                .string_to_object(str);
        org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)
                ._get_delegate();
        _set_delegate(delegate);
    }

    private void writeObject(java.io.ObjectOutputStream s)
            throws java.io.IOException {
        String[] args = null;
        java.util.Properties props = null;
        String str = org.omg.CORBA.ORB.init(args, props).object_to_string(this);
        s.writeUTF(str);
    }
} // class _ComponentLoaderStub